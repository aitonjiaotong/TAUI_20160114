package cn.com.aiton.services;


import java.util.List;

import cn.com.aiton.domain.GbtTimeBase;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface TimeBaseService {
    /**
     * 从信号机得到某个节点的时基数据
     * @param node
     * @return
     */
    public List<GbtTimeBase> getTimeBase(TscNode node);

    /**
     * 设置时基数据到信号机
     * 通过月历
     * @param gbtTimeBaseList
     * @param node
     * @return
     */
    public Message setTimeBaseByCalendar(List<GbtTimeBase> gbtTimeBaseList, TscNode node);

    /**
     * 设置时基数据到信号机
     * 通过周模式
     * @param gbtTimeBases
     * @param node
     * @return
     */
    public Message setTimeBaseByWeekend(List<GbtTimeBase> gbtTimeBases, TscNode node);



}
