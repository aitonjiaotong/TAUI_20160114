package cn.com.aiton.services.impl;

import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.MunualControlService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

/**
 * Created by Administrator on 2015/5/30.
 */
public class MunualControlServiceImpl implements MunualControlService {
    @Override
    public Message switchMunual(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_MUNUAL);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchSelf(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SELF);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchStepByNumber(TscNode node,int num) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            GbtDefine.CTRL_NEXTSTEP[3] = (byte)(num);
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchNextStep(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTSTEP);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchNextPhase(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTPHASE);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchPhaseByNumber(TscNode node,int num) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTPHASE);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchNextDirec(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NEXTDIREC);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchNorth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_NORTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchEast(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_EAST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchSouth(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_SOUTH);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message switchWest(TscNode node) {
        try {
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.CTRL_WEST);
            byte[] result = client.receiveByte(node.getIpAddress(), node.getPort());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
