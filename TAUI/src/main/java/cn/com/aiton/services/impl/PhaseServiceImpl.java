package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtPhase;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PhaseService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class PhaseServiceImpl implements PhaseService {
    @Override
    public List<GbtPhase> getPhase(TscNode node) {
        List<GbtPhase> gbtPhases = new ArrayList<GbtPhase>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PHASE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PHASE_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,bytes[3] * GbtDefine.PHASE_BYTE_SIZE);
            byte[][] phaseArrayResult = ByteUtils.oneArrayToTwoArray(objectArray,bytes[3],GbtDefine.PHASE_BYTE_SIZE);
            for(int i=0;i<bytes[3];i++){
                GbtPhase gbtPhase = new GbtPhase();
                gbtPhase.setDeviceId(node.getId());
                gbtPhase.setPhaseId(ByteUtils.bytesUInt(phaseArrayResult[i][0]));
                gbtPhase.setPedestrainGreen(ByteUtils.bytesUInt(phaseArrayResult[i][1]));
                gbtPhase.setPedestrainClear(ByteUtils.bytesUInt(phaseArrayResult[i][2]));
                gbtPhase.setMinGreen(ByteUtils.bytesUInt(phaseArrayResult[i][3]));
                gbtPhase.setGreenDelayUnit(ByteUtils.bytesUInt(phaseArrayResult[i][4]));
                gbtPhase.setMaxGreen1(ByteUtils.bytesUInt(phaseArrayResult[i][5]));
                gbtPhase.setMaxGreen2(ByteUtils.bytesUInt(phaseArrayResult[i][6]));
                gbtPhase.setFixGreen(ByteUtils.bytesUInt(phaseArrayResult[i][7]));
                gbtPhase.setGreenFlash(ByteUtils.bytesUInt(phaseArrayResult[i][8]));
                gbtPhase.setPhaseType(ByteUtils.bytesUInt(phaseArrayResult[i][9]));
                gbtPhase.setPhaseOption(ByteUtils.bytesUInt(phaseArrayResult[i][10]));
                gbtPhase.setExtend(ByteUtils.bytesUInt(phaseArrayResult[i][11]));

                gbtPhases.add(gbtPhase);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtPhases;
    }

    @Override
    public Message setPhase(List<GbtPhase> gbtPhases,TscNode node) {
        Message message = new Message();
        try{
            //byte[] hex = new byte[GbtDefine.PHASE_BYTE_SIZE*GbtDefine.PHASE_RESULT_LEN +GbtDefine.SET_PHASE_RESPONSE.length + 1];
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PHASE_RESPONSE, (byte) gbtPhases.size());
            Iterator<GbtPhase> gbtPhaseIterator = gbtPhases.iterator();
            while(gbtPhaseIterator.hasNext()){
                GbtPhase gbtPhase = gbtPhaseIterator.next();
                byte[] objectArray = {(byte)gbtPhase.getPhaseId(),(byte)gbtPhase.getPedestrainGreen()
                        ,(byte)gbtPhase.getPedestrainClear(),(byte)gbtPhase.getMinGreen()
                        ,(byte)gbtPhase.getGreenDelayUnit(),(byte)gbtPhase.getMaxGreen1()
                        ,(byte)gbtPhase.getMaxGreen2(),(byte)gbtPhase.getFixGreen()
                        ,(byte)gbtPhase.getGreenFlash(),(byte)gbtPhase.getPhaseType()
                        ,(byte)gbtPhase.getPhaseOption(),(byte)gbtPhase.getExtend()};
                hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
          //  byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
          //  System.out.println("服务端回应数据：" + info);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
