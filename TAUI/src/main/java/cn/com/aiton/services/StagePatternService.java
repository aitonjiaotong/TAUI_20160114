package cn.com.aiton.services;


import java.util.List;

import cn.com.aiton.domain.GbtStagePattern;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface StagePatternService {
    /**
     * 从信号机读取阶段配置数据
     * @param node
     * @return
     */
    public List<GbtStagePattern> getStagePattern16Phase(TscNode node);

    /**
     * 从信号机读取32相位的阶段配置数据
     * @param node
     * @return
     */
    public List<GbtStagePattern> getStagePattern32Phase(TscNode node);
    /**
     * 将阶段配置数据保存到16相位的信号机中
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    public Message setStagePatternBy16Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns);

    /**
     * 将阶段数据保存到32位信号机中
     * @param node
     * @param gbtStagePatterns
     * @return
     */
    public Message setStagePatternBy32Phase(TscNode node, List<GbtStagePattern> gbtStagePatterns);



}
