package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDetector;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.DetectorService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-14.
 */

public class DetectorServiceImpl implements DetectorService {
    public int getDetectorSensitivityOneBorad1_8(TscNode node){
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_1_1_8);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * 得到检测器的1板9-16的灵敏度
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityOneBorad9_16(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_1_9_16);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * 得到检测器的1板震荡频率
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorOscillatorFrequency1(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_OSCILLATOR_FREQUENCY_2);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return level;
    }

    /**
     * 得到检测器的2板震荡频率
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorOscillatorFrequency2(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_OSCILLATOR_FREQUENCY_1);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return level;
    }

    /**
     * 得到检测器的2板1-8的灵敏度
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityTwoBorad1_8(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_2_1_8);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
          //  System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * 得到检测器的2板9-16的灵敏度
     *
     * @param node
     * @return
     */
    @Override
    public int getDetectorSensitivityTwoBorad9_16(TscNode node) {
        int level = 0;
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR_SENSITIVITY_2_9_16);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
            level = bytes[5];
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return level;
    }

    /**
     * 设置检测器震荡频率
     *
     * @param b
     * @param node
     * @return
     */
    @Override
    public Message setOscillatorFrequency(byte b, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第1块板1-7通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig1(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第1块板8-14通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig2(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第1块板15-16通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig3(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第2块板1-7通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig4(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第2块板8-14通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig5(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器灵敏度数值第2块板15-16通道
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensityvityDig6(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 根据板卡设置检测器灵敏 度
     *
     * @param boradNum
     * @param se
     * @param node
     * @return
     */
    @Override
    public Message setSensitivity(int boradNum, byte se, TscNode node) {
        return null;
    }

    /**
     * 检测器第1块板 1- 8通道设置方法
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv11(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器第1块板 9- 16通道设置方法
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv12(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器第二块板 1- 8通道设置方法
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv21(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 检测器第二块板 9- 16通道设置方法
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv22(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 设置检测器灵敏 度整个系统两块检测器板
     *
     * @param bytes
     * @param node
     * @return
     */
    @Override
    public Message setSensitivityAdv(byte[] bytes, TscNode node) {
        return null;
    }

    /**
     * 返回检测器灵敏度等级第1 块1-8通道
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv11(TscNode node) {
        return null;
    }

    /**
     * 返回检测器灵敏度等级第1 块9-16通道
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv12(TscNode node) {
        return null;
    }

    /**
     * 返回检测器灵敏度等级第2 块1-8通道
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv21(TscNode node) {
        return null;
    }

    /**
     * 返回检测器灵敏度等级第2 块9-16通道
     *
     * @param node
     * @return
     */
    @Override
    public List<Byte> setSensitivityAdv22(TscNode node) {
        return null;
    }

    /**
     * 取得所有检测器的配置数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtDetector> getDetector(TscNode node) {
        List<GbtDetector> gbtDetectors = new ArrayList<GbtDetector>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_DETECTOR);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.DETECTOR_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] detectorArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.DETECTOR_RESULT_LEN, GbtDefine.DETECTOR_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtDetector gbtDetector = new GbtDetector();
                gbtDetector.setDeviceId(node.getId());
                gbtDetector.setDetectorId(ByteUtils.bytesUInt(detectorArrayResult[i][0]));
                gbtDetector.setPhaseId(ByteUtils.bytesUInt(detectorArrayResult[i][1]));
                gbtDetector.setDetectorType(ByteUtils.bytesUInt(detectorArrayResult[i][2]));
                gbtDetector.setDirec(ByteUtils.bytesUInt(detectorArrayResult[i][3]));
                gbtDetector.setRequestEffectTime(ByteUtils.bytesUInt(detectorArrayResult[i][4]));
                gbtDetector.setDetectorOption(ByteUtils.bytesUInt(detectorArrayResult[i][5]));
                gbtDetector.setSaturationVolume((short)((detectorArrayResult[i][6] << 8) + detectorArrayResult[i][7]));
                gbtDetector.setSaturationOccupancy(ByteUtils.bytesUInt(detectorArrayResult[i][8]));
                gbtDetectors.add(gbtDetector);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtDetectors;
    }

    /**
     * 设置所有检测器配置数据
     *
     * @param gbtDetectors
     * @return
     */
    @Override
    public Message setDetector(List<GbtDetector> gbtDetectors,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_DETECTOR_RESPONSE, (byte) gbtDetectors.size());
            Iterator<GbtDetector> gbtDetectorIterator = gbtDetectors.iterator();
            while(gbtDetectorIterator.hasNext()){
                GbtDetector gbtDetector = gbtDetectorIterator.next();
                byte[] saturationVolume = ByteUtils.shortToByte(gbtDetector.getSaturationVolume());
                byte[] objectArray = {(byte)gbtDetector.getDetectorId(),(byte)gbtDetector.getPhaseId(),(byte)gbtDetector.getDetectorType(),(byte)gbtDetector.getDirec(),(byte)gbtDetector.getRequestEffectTime(),(byte)gbtDetector.getDetectorOption(),saturationVolume[1],saturationVolume[0],(byte)gbtDetector.getSaturationOccupancy()};
                hex = ArrayUtils.addAll(hex,objectArray);
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
