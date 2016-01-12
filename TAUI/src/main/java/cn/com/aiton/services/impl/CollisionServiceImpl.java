package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtCollision;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.CollisionService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class CollisionServiceImpl implements CollisionService {


    @Override
    public List<GbtCollision> getCollisionBy16Phase(TscNode node) {
        List<GbtCollision> gbtCollisions = new ArrayList<GbtCollision>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_COLLISION);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.GBT20999_COLLISION_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] collisionArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.COLLISION_RESULT_LENGTH, GbtDefine.GBT20999_COLLISION_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtCollision gbtCollision = new GbtCollision();
                gbtCollision.setDeviceId(node.getId());
                gbtCollision.setPhaseId(collisionArrayResult[i][0]);
                byte[] flag = new byte[]{collisionArrayResult[i][1] ,collisionArrayResult[i][2]};
                gbtCollision.setFlag(ByteUtils.byteToInt(flag));
                gbtCollisions.add(gbtCollision);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtCollisions;
    }

    @Override
    public List<GbtCollision> getCollisionBy32Phase(TscNode node) {
        List<GbtCollision> gbtCollisions = new ArrayList<GbtCollision>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_COLLISION);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByASCII(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.COLLISION_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] collisionArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.COLLISION_RESULT_LENGTH, GbtDefine.COLLISION_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtCollision gbtCollision = new GbtCollision();
                gbtCollision.setDeviceId(node.getId());
                gbtCollision.setPhaseId(ByteUtils.bytesUInt(collisionArrayResult[i][0]));
                byte[] flag = new byte[]{collisionArrayResult[i][1] ,collisionArrayResult[i][2],collisionArrayResult[i][3],collisionArrayResult[i][4]};
                gbtCollision.setFlag(ByteUtils.byteToInt(flag));
                gbtCollisions.add(gbtCollision);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtCollisions;
    }

    @Override
    public Message setCollision(List<GbtCollision> gbtCollisions ,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_COLLISION_RESPONSE, (byte)gbtCollisions.size());
            Iterator<GbtCollision> gbtCollisionIterator = gbtCollisions.iterator();
            while(gbtCollisionIterator.hasNext()){
                GbtCollision gbtCollision = gbtCollisionIterator.next();
                byte[] flag = ByteUtils.intToByte(gbtCollision.getFlag());

                byte[] phaseId = {(byte)gbtCollision.getPhaseId()};
                byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
          //  System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
