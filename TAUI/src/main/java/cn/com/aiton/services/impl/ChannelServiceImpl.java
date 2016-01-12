package cn.com.aiton.services.impl;


import net.tsz.afinal.FinalDb;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtChannel;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.ChannelService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class ChannelServiceImpl implements ChannelService {


    /**
     * 通过Udp取得信号机的所有某个节点的通道数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtChannel> getChannel(TscNode node) {
        List<GbtChannel> gbtChannels = new ArrayList<GbtChannel>();
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_CHANNEL);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.CHANNEL_BYTE_SIZE];
            System.arraycopy(bytes, 4, objectArray, 0, objectArray.length);
            byte[][] channelArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.CHANNEL_RESULT_LEN, GbtDefine.CHANNEL_BYTE_SIZE);
            for (int i = 0; i < bytes[3]; i++) {
                GbtChannel gbtChannel = new GbtChannel();
                gbtChannel.setDeviceId(node.getId());
                gbtChannel.setChannelId(ByteUtils.bytesUInt(channelArrayResult[i][0]));
                gbtChannel.setControlSource(ByteUtils.bytesUInt(channelArrayResult[i][1]));
                gbtChannel.setAutoFlashControl(ByteUtils.bytesUInt(channelArrayResult[i][2]));
                gbtChannel.setControlType(ByteUtils.bytesUInt(channelArrayResult[i][3]));
                gbtChannels.add(gbtChannel);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return gbtChannels;
    }

    /**
     * 保存某个节点的通道数据
     *
     * @param node
     * @param gbtChannels
     * @return
     */
    @Override
    public Message setChannel(TscNode node, List<GbtChannel> gbtChannels) {
        Message message = new Message();
        try {
            byte[] hex = ArrayUtils.add(GbtDefine.SET_CHANNEL_RESPONSE, (byte) gbtChannels.size());
            Iterator<GbtChannel> gbtChannelIterator = gbtChannels.iterator();
            while (gbtChannelIterator.hasNext()) {
                GbtChannel gbtChannel = gbtChannelIterator.next();
                hex = ArrayUtils.add(hex, (byte)gbtChannel.getChannelId());
                hex = ArrayUtils.add(hex, (byte)gbtChannel.getControlSource());
                hex = ArrayUtils.add(hex, (byte)gbtChannel.getAutoFlashControl());
                hex = ArrayUtils.add(hex, (byte)gbtChannel.getControlType());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return message;
    }

}