package cn.com.aiton.services.impl;


import java.util.List;

import cn.com.aiton.domain.CountDown;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.CountDownService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-16.
 */

public class CountDownServiceImpl implements CountDownService {
    @Override
    public List<CountDown> getCntDownDev(TscNode node) {
        // TODO
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_CNTDOWNDEV);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Message setCntDownDev(List<CountDown> countDowns, TscNode node) {
        // TODO
        return null;
    }
}
