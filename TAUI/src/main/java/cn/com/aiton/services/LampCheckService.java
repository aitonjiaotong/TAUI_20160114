package cn.com.aiton.services;

import java.util.List;

import cn.com.aiton.domain.GbtLampCheck;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

public interface LampCheckService {
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseOne(TscNode node);
    /**
     * 关闭灯控板2的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseTwo(TscNode node);
    /**
     * 关闭灯控板3的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseThree(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseFour(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseFive(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseSix(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseSeven(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckCloseEight(TscNode node);
    /**
     * 关闭灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public List<Message> setLampCheckCloseALL(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenOne(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenTwo(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenThree(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenFour(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenFive(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenSix(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenSeven(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public Message setLampCheckOpenEight(TscNode node);
    /**
     * 打开灯控板1的绿冲突检测
     * @param node
     * @return
     */
    public List<Message> setLampCheckOpenALL(TscNode node);
    /**
     * 得到灯控板1的绿冲突检测数据
     * @param node
     * @return
     */
    public List<GbtLampCheck> getLampCheck(TscNode node);

    public Message setLampCheck(List<GbtLampCheck> gbtLampChecks,TscNode node);
}
