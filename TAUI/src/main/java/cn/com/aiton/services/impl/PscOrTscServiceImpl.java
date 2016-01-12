package cn.com.aiton.services.impl;

import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PscOrTscService;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

/**
 * Created by Administrator on 2015/5/30.
 */
public class PscOrTscServiceImpl implements PscOrTscService {
    @Override
    public Message switchOnePsc(TscNode node, int greenTime) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_PSC_1);
            byte[] psc1greentime = GbtDefine.SET_PSC_1_GREEN_TIME;
            psc1greentime[5] = (byte)greenTime;
            client.send(node.getIpAddress(), node.getPort(),psc1greentime);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchTwoPsc(TscNode node, int greenTime1, int greenTime2) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_TSC);
            byte[] psc1greentime = GbtDefine.SET_PSC_1_GREEN_TIME;
            psc1greentime[5] = (byte)greenTime1;
            client.send(node.getIpAddress(), node.getPort(),psc1greentime);
            byte[] psc2greentime = GbtDefine.SET_PSC_2_GREEN_TIME;
            psc1greentime[5] = (byte)greenTime2;
            client.send(node.getIpAddress(), node.getPort(),psc2greentime);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchTwoTsc(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.SET_TSC);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
