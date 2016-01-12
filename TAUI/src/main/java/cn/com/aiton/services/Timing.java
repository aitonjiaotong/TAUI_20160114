package cn.com.aiton.services;


import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface Timing {
    /**
     * 校时功能
     * @param node
     * @return
     */
    public Message setTiming(TscNode node);
}
