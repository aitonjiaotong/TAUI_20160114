package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtOverlap;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.OverlapPhaseService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.OverlapPhaseUtils;
import cn.com.aiton.utils.UdpClientSocket;

public class OverlapPhaseServiceImpl implements OverlapPhaseService {
    /**
     * 从信号机取得跟随相位数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtOverlap> getOverlapPhase(TscNode node) {
        List<GbtOverlap> gbtOverlaps = new ArrayList<GbtOverlap>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_OVERLAPPHASE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.OVERLAPPHASE_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] overlapArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.OVERLAPPHASE_RESULT_LEN, GbtDefine.OVERLAPPHASE_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtOverlap gbtOverlap = new GbtOverlap();
                gbtOverlap.setDeviceId(node.getId());
                gbtOverlap.setOverlapId(ByteUtils.bytesUInt(overlapArrayResult[i][0]));
                gbtOverlap.setOverlapType(ByteUtils.bytesUInt(overlapArrayResult[i][1]));
                gbtOverlap.setIncludePhaseCount(ByteUtils.bytesUInt(overlapArrayResult[i][2]));
                gbtOverlap.setIncludePhase(new String(overlapArrayResult[i][3]+","+overlapArrayResult[i][4]+","+overlapArrayResult[i][5]+","+overlapArrayResult[i][6]+","+overlapArrayResult[i][7]+","+overlapArrayResult[i][8]+","+overlapArrayResult[i][9]+","+overlapArrayResult[i][10]+","+overlapArrayResult[i][11]+","+overlapArrayResult[i][12]+","+overlapArrayResult[i][13]+","+overlapArrayResult[i][14]+","+overlapArrayResult[i][15]+","+overlapArrayResult[i][16]+","+overlapArrayResult[i][17]+","+overlapArrayResult[i][18]));
                gbtOverlap.setAmendPhaseCount(ByteUtils.bytesUInt(overlapArrayResult[i][19]));
                gbtOverlap.setAmendPhase(new String(overlapArrayResult[i][20] + "," + overlapArrayResult[i][21] + "," + overlapArrayResult[i][22] + "," + overlapArrayResult[i][23] + "," + overlapArrayResult[i][24] + "," + overlapArrayResult[i][25] + "," + overlapArrayResult[i][26] + "," + overlapArrayResult[i][27] + "," + overlapArrayResult[i][28] + "," + overlapArrayResult[i][29] + "," + overlapArrayResult[i][30] + "," + overlapArrayResult[i][31] + "," + overlapArrayResult[i][32] + "," + overlapArrayResult[i][33] + "," + overlapArrayResult[i][34] + "," + overlapArrayResult[i][35]));
                gbtOverlap.setTailGreen(ByteUtils.bytesUInt(overlapArrayResult[i][36]));
                gbtOverlap.setTailYellow(ByteUtils.bytesUInt(overlapArrayResult[i][37]));
                gbtOverlap.setTailRed(ByteUtils.bytesUInt(overlapArrayResult[i][38]));
                gbtOverlaps.add(gbtOverlap);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtOverlaps;
    }

    /**
     * 将跟随相位数据设置到信号机
     *
     * @param node
     * @param gbtOverlaps
     * @return
     */
    @Override
    public Message setOverlapPhase(TscNode node, List<GbtOverlap> gbtOverlaps) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_OVERLAPPHASE_RESPONSE, (byte) gbtOverlaps.size());
            Iterator<GbtOverlap> gbtOverlapIterator = gbtOverlaps.iterator();
            while(gbtOverlapIterator.hasNext()){
                GbtOverlap gbtChannel = gbtOverlapIterator.next();
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getOverlapId());
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getOverlapType());
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getIncludePhaseCount());
                hex = ArrayUtils.addAll(hex, OverlapPhaseUtils.stringToByteArray(gbtChannel.getIncludePhase()));
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getAmendPhaseCount());
                hex = ArrayUtils.addAll(hex, OverlapPhaseUtils.stringToByteArray(gbtChannel.getAmendPhase()));
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getTailGreen());
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getTailYellow());
                hex = ArrayUtils.add(hex,(byte)gbtChannel.getTailRed());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }

}
