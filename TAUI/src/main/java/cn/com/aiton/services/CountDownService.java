package cn.com.aiton.services;

import java.util.List;

import cn.com.aiton.domain.CountDown;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface CountDownService {
    public List<CountDown> getCntDownDev(TscNode node);

    public Message setCntDownDev(List<CountDown> countDowns, TscNode node);
}
