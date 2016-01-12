package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtStagePattern;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.StagePatternService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class StagePatternServiceImpl implements StagePatternService {
    /**
     * 从信号机读取32相位的阶段配置数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtStagePattern> getStagePattern32Phase(TscNode node) {
        List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_STAGEPATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN * GbtDefine.STAGEPATTERN_BYTE_SIZE];
            System.arraycopy(bytes,5,objectArray,0,objectArray.length);
            byte[][] stagePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN, GbtDefine.STAGEPATTERN_BYTE_SIZE);
            for(int i=0; i<GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN ;i++){
                GbtStagePattern gbtStagePattern = new GbtStagePattern();
                gbtStagePattern.setDeviceId(node.getId());
                gbtStagePattern.setStagePatternId(ByteUtils.bytesUInt(stagePatternArrayResult[i][0]));
                gbtStagePattern.setStageId(ByteUtils.bytesUInt(stagePatternArrayResult[i][1]));
                byte[] allowPhase = {stagePatternArrayResult[i][2],stagePatternArrayResult[i][3],stagePatternArrayResult[i][4],stagePatternArrayResult[i][5]};
                gbtStagePattern.setAllowPhase(ByteUtils.byteToInt(allowPhase));
                gbtStagePattern.setGreenTime(ByteUtils.bytesUInt(stagePatternArrayResult[i][6]));
                gbtStagePattern.setYellowTime(ByteUtils.bytesUInt(stagePatternArrayResult[i][7]));
                gbtStagePattern.setRedTime(ByteUtils.bytesUInt(stagePatternArrayResult[i][8]));
                gbtStagePattern.setOption(ByteUtils.bytesUInt(stagePatternArrayResult[i][9]));
                gbtStagePatterns.add(gbtStagePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtStagePatterns;
    }

    /**
     * @param node
     * @return
     */
    @Override
    public List<GbtStagePattern> getStagePattern16Phase(TscNode node) {
        List<GbtStagePattern> gbtStagePatterns = new ArrayList<GbtStagePattern>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_STAGEPATTERN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN * GbtDefine.STAGE_PATTERN_BYTE_SIZE_16];
            System.arraycopy(bytes,5,objectArray,0,objectArray.length);
            byte[][] stagePatternArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN, GbtDefine.STAGE_PATTERN_BYTE_SIZE_16);
            for(int i=0; i< GbtDefine.STAGE_RESULT_LEN * GbtDefine.STAGEPATTERN_RESULT_LEN  ;i++){
                GbtStagePattern gbtStagePattern = new GbtStagePattern();
                gbtStagePattern.setDeviceId(node.getId());
                gbtStagePattern.setStagePatternId(stagePatternArrayResult[i][0]);
                gbtStagePattern.setStageId(stagePatternArrayResult[i][1]);
                byte[] allowPhase = {stagePatternArrayResult[i][2],stagePatternArrayResult[i][3]};
                gbtStagePattern.setAllowPhase(ByteUtils.byteToInt(allowPhase));
                gbtStagePattern.setGreenTime(stagePatternArrayResult[i][4]);
                gbtStagePattern.setYellowTime(stagePatternArrayResult[i][5]);
                gbtStagePattern.setRedTime(stagePatternArrayResult[i][6]);
                gbtStagePattern.setOption(stagePatternArrayResult[i][7]);
                gbtStagePatterns.add(gbtStagePattern);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtStagePatterns;
    }

    /**
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    @Override
    public Message setStagePatternBy16Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_STAGEPATTERN_RESPONSE, (byte) gbtStagePatterns.size());
            hex = ArrayUtils.add(hex, (byte) (GbtDefine.STAGE_RESULT_LEN));
            Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
            while(gbtStagePatternIterator.hasNext()){
                GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getStagePatternId());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getStageId());
                hex = ArrayUtils.addAll(hex, ByteUtils.shortToByte((short)gbtStagePattern.getAllowPhase()));
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getGreenTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getYellowTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getRedTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getOption());
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

    /**
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    @Override
    public Message setStagePatternBy32Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_STAGEPATTERN_RESPONSE, (byte) GbtDefine.STAGEPATTERN_RESULT_LEN);
            hex = ArrayUtils.add(hex,(byte)(GbtDefine.STAGE_RESULT_LEN));
            Iterator<GbtStagePattern> gbtStagePatternIterator = gbtStagePatterns.iterator();
            while(gbtStagePatternIterator.hasNext()){
                GbtStagePattern gbtStagePattern = gbtStagePatternIterator.next();
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getStagePatternId());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getStageId());
                hex = ArrayUtils.addAll(hex, ByteUtils.intToByte(gbtStagePattern.getAllowPhase()));
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getGreenTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getYellowTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getRedTime());
                hex = ArrayUtils.add(hex,(byte)gbtStagePattern.getOption());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }


}
