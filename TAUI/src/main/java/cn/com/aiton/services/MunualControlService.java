package cn.com.aiton.services;

import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 2015/5/30.
 */
public interface MunualControlService {
    public Message switchMunual(TscNode node);
    public Message switchSelf(TscNode node);
    public Message switchStepByNumber(TscNode node,int num);
    public Message switchNextStep(TscNode node);
    public Message switchNextPhase(TscNode node);
    public Message switchPhaseByNumber(TscNode node,int num);
    public Message switchNextDirec(TscNode node);
    public Message switchNorth(TscNode node);
    public Message switchEast(TscNode node);
    public Message switchSouth(TscNode node);
    public Message switchWest(TscNode node);
}
