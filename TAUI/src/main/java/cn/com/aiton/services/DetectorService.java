package cn.com.aiton.services;

import java.util.List;

import cn.com.aiton.domain.GbtDetector;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface DetectorService {
    /**
     * 得到检测器的1板1-8的灵敏度
     * @param node
     * @return
     */
    public int getDetectorSensitivityOneBorad1_8(TscNode node);
    /**
     * 得到检测器的1板9-16的灵敏度
     * @param node
     * @return
     */
    public int getDetectorSensitivityOneBorad9_16(TscNode node);
    /**
     * 得到检测器的1板震荡频率
     * @param node
     * @return
     */
    public int getDetectorOscillatorFrequency1(TscNode node);
    /**
     * 得到检测器的2板震荡频率
     * @param node
     * @return
     */
    public int getDetectorOscillatorFrequency2(TscNode node);

    /**
     * 得到检测器的2板1-8的灵敏度
     * @param node
     * @return
     */
    public int getDetectorSensitivityTwoBorad1_8(TscNode node);
    /**
     * 得到检测器的2板9-16的灵敏度
     * @param node
     * @return
     */
    public int getDetectorSensitivityTwoBorad9_16(TscNode node);

    /**
     * 设置检测器震荡频率
     * @param b
     * @param node
     * @return
     */
    public Message setOscillatorFrequency(byte b, TscNode node);
    /**
     * 检测器灵敏度数值第1块板1-7通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig1(byte[] bytes, TscNode node);
    /**
     * 检测器灵敏度数值第1块板8-14通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig2(byte[] bytes, TscNode node);
    /**
     * 检测器灵敏度数值第1块板15-16通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig3(byte[] bytes, TscNode node);
    /**
     * 检测器灵敏度数值第2块板1-7通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig4(byte[] bytes, TscNode node);
    /**
     * 检测器灵敏度数值第2块板8-14通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig5(byte[] bytes, TscNode node);

    /**
     * 检测器灵敏度数值第2块板15-16通道
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensityvityDig6(byte[] bytes, TscNode node);

    /**
     * 根据板卡设置检测器灵敏 度
     * @param boradNum
     * @param se
     * @param node
     * @return
     */
    public Message setSensitivity(int boradNum, byte se, TscNode node);

    /**
     * 检测器第1块板 1- 8通道设置方法
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv11(byte[] bytes, TscNode node);

    /**
     * 检测器第1块板 9- 16通道设置方法
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv12(byte[] bytes, TscNode node);

    /**
     * 检测器第二块板 1- 8通道设置方法
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv21(byte[] bytes, TscNode node);

    /**
     * 检测器第二块板 9- 16通道设置方法
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv22(byte[] bytes, TscNode node);

    /**
     * 设置检测器灵敏 度整个系统两块检测器板
     * @param bytes
     * @param node
     * @return
     */
    public Message setSensitivityAdv(byte[] bytes, TscNode node);

    /**
     * 返回检测器灵敏度等级第1 块1-8通道
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv11(TscNode node);
    /**
     * 返回检测器灵敏度等级第1 块9-16通道
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv12(TscNode node);
    /**
     * 返回检测器灵敏度等级第2 块1-8通道
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv21(TscNode node);
    /**
     * 返回检测器灵敏度等级第2 块9-16通道
     * @param node
     * @return
     */
    public List<Byte> setSensitivityAdv22(TscNode node);

    /**
     * 取得所有检测器的配置数据
     * @param node
     * @return
     */
    public List<GbtDetector> getDetector(TscNode node);

    /**
     * 设置所有检测器配置数据
     * @param gbtDetectors
     * @return
     */
    public Message setDetector(List<GbtDetector> gbtDetectors, TscNode node);
}
