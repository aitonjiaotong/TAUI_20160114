package cn.com.aiton.services.impl;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtTimePattern;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PatternService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class PatternServiceImpl implements PatternService {
    /**
     * 从信号机读取配时数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtTimePattern> getTimePattern(TscNode node) {
        List<GbtTimePattern> gbtTimePatterns = new ArrayList<GbtTimePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PATTERN_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] timePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PATTERN_RESULT_LEN, GbtDefine.PATTERN_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtTimePattern gbtTimePattern = new GbtTimePattern();
                gbtTimePattern.setDeviceId(node.getId());
                gbtTimePattern.setTimePatternId(ByteUtils.bytesUInt(timePatternArrayResult[i][0]));
                gbtTimePattern.setCycleTime(ByteUtils.bytesUInt(timePatternArrayResult[i][1]));
                gbtTimePattern.setOffset(ByteUtils.bytesUInt(timePatternArrayResult[i][2]));
                gbtTimePattern.setCoordinatePhase(ByteUtils.bytesUInt(timePatternArrayResult[i][3]));
                gbtTimePattern.setStagePatternId(ByteUtils.bytesUInt(timePatternArrayResult[i][4]));
                gbtTimePatterns.add(gbtTimePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtTimePatterns;
    }

    /**
     * 设置配时数据到信号机
     *
     * @param node
     * @param gbtTimePatterns
     * @return
     */
    @Override
    public Message setTimePattern(TscNode node, List<GbtTimePattern> gbtTimePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PATTERN_RESPONSE, (byte) gbtTimePatterns.size());
            Iterator<GbtTimePattern> gbtTimePatternIterator = gbtTimePatterns.iterator();
            while(gbtTimePatternIterator.hasNext()){
                GbtTimePattern gbtTimePattern = gbtTimePatternIterator.next();
                hex = ArrayUtils.add(hex, (byte)gbtTimePattern.getTimePatternId());
                hex = ArrayUtils.add(hex,(byte)gbtTimePattern.getCycleTime());
                hex = ArrayUtils.add(hex,(byte)gbtTimePattern.getOffset());
                hex = ArrayUtils.add(hex,(byte)gbtTimePattern.getCoordinatePhase());
                hex = ArrayUtils.add(hex,(byte)gbtTimePattern.getStagePatternId());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
          //  System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }

}
