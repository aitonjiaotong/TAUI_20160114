package cn.com.aiton.services;



import java.util.List;

import cn.com.aiton.domain.GbtChannel;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ChannelService {
    /**
     * 通过Udp取得信号机的所有某个节点的通道数据
     * @param node
     * @return
     */
    public List<GbtChannel> getChannel(TscNode node);

    /**
     * 保存某个节点的通道数据
     * @param node
     * @param gbtChannels
     * @return
     */
    public Message setChannel(TscNode node, List<GbtChannel> gbtChannels);


}
