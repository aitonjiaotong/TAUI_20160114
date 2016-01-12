package cn.com.aiton.services;

import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 2015/5/30.
 */
public interface PscOrTscService {
    public Message switchOnePsc(TscNode node ,int greenTime);
    public Message switchTwoPsc(TscNode node ,int greenTime1,int greenTime2);
    public Message switchTwoTsc(TscNode node);
}
