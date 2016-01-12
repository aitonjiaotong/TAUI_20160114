package cn.com.aiton.services;


import java.util.List;

import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ScheduleService {
    /**
     * 得到某个信号机的时段表数据
     * @param node
     * @return
     */
    public List<GbtSchedule> getSchedule(TscNode node);

    /**
     * 保存某个信号机的时段数据
     * @param node
     * @param gbtSchedules
     * @return
     */
    public Message setSchedule(TscNode node, List<GbtSchedule> gbtSchedules);


}
