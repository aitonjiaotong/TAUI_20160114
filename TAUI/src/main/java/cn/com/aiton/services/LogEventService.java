package cn.com.aiton.services;

import java.util.Date;
import java.util.List;

import cn.com.aiton.domain.GbtEventLog;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface LogEventService {
    /**
     * 取得一个节点的所有日志数据
     * @param node
     * @return
     */
    public List<GbtEventLog> getEventLog(TscNode node);

    /**
     * 根据时间取得日志，这个时间是哪一天。
     * @param node
     * @param date
     * @return
     */
    public List<GbtEventLog> getEventLogByTime(TscNode node, Date date);

    /**
     * 根据日志类型读取日志数据
     * @param node
     * @param type
     * @return
     */
    public List<GbtEventLog> getEventLogByEventType(TscNode node, byte type);

    /**
     * 根据两个时间，将开始时间和结束时间内的日志数据读取出来
     * @param node
     * @param startTime
     * @param endTime
     * @return
     */
    public List<GbtEventLog> getEventLogByStartTimeAndEndTime(TscNode node, Date startTime, Date endTime);
}
