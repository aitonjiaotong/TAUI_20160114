package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtTimeBase;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.TimeBaseService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class TimeBaseServiceImpl implements TimeBaseService {

    /**
     * 从信号机得到某个节点的时基数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtTimeBase> getTimeBase(TscNode node) {
        List<GbtTimeBase> gbtTimeBases = new ArrayList<GbtTimeBase>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PLAN);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PLAN_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] timeBaseArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PLAN_RESULT_LEN, GbtDefine.PLAN_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtTimeBase gbtTimeBase = new GbtTimeBase();
                gbtTimeBase.setDeviceId(node.getId());
                gbtTimeBase.setTimeBaseId(ByteUtils.bytesUInt(timeBaseArrayResult[i][0]));
                byte[] flag = new byte[]{timeBaseArrayResult[i][1] ,timeBaseArrayResult[i][2]};
                gbtTimeBase.setMonth(ByteUtils.byteToShort(flag));

                gbtTimeBase.setWeek(ByteUtils.bytesUInt(timeBaseArrayResult[i][3]));
                byte[] dayFlag = new byte[]{timeBaseArrayResult[i][4],timeBaseArrayResult[i][5],timeBaseArrayResult[i][6],timeBaseArrayResult[i][7]};
                gbtTimeBase.setDay(ByteUtils.byteToInt(dayFlag));
                gbtTimeBase.setScheduleId(ByteUtils.bytesUInt(timeBaseArrayResult[i][8]));
                gbtTimeBases.add(gbtTimeBase);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtTimeBases;
    }

    /**
     * 设置时基数据到信号机
     * 通过月历
     *
     * @param gbtTimeBaseList
     * @param node
     * @return
     */
    @Override
    public Message setTimeBaseByCalendar(List<GbtTimeBase> gbtTimeBaseList, TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PLAN_RESPONSE, (byte) gbtTimeBaseList.size());
            Iterator<GbtTimeBase> gbtTimeBaseIterator = gbtTimeBaseList.iterator();
            while(gbtTimeBaseIterator.hasNext()){
                GbtTimeBase gbtTimeBase = gbtTimeBaseIterator.next();
                byte timeBaseId =(byte)gbtTimeBase.getTimeBaseId();
                byte[] monthFlagtemp = ByteUtils.intToByte(gbtTimeBase.getMonth());
                byte[] monthFlag = new byte[2];
                monthFlag[0] = monthFlagtemp[0];
                monthFlag[1] = monthFlagtemp[1];
                byte weekFlag = (byte)gbtTimeBase.getWeek();
                byte[] dayFl = ByteUtils.longToByte(gbtTimeBase.getDay());
                byte[] dayFlag = new byte[4];
                dayFlag[0] = dayFl[0];
                dayFlag[1] = dayFl[1];
                dayFlag[2] = dayFl[2];
                dayFlag[3] = dayFl[3];
                byte scheduleId = (byte)gbtTimeBase.getScheduleId();
                hex = ArrayUtils.add(hex,timeBaseId);
                hex = ArrayUtils.addAll(hex,monthFlag);
                hex = ArrayUtils.add(hex,weekFlag);
                hex = ArrayUtils.addAll(hex,dayFlag);
                hex = ArrayUtils.add(hex,scheduleId);
                //byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                //hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           //System.out.println("服务端回应数据：" + info);
            message = CheckGbt.check(bytes);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }



    /**
     * 设置时基数据到信号机
     * 通过周模式
     *
     * @param gbtTimeBases
     * @param node
     * @return
     */
    @Override
    public Message setTimeBaseByWeekend(List<GbtTimeBase> gbtTimeBases, TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PLAN_RESPONSE, (byte) gbtTimeBases.size());
            Iterator<GbtTimeBase> gbtTimeBaseIterator = gbtTimeBases.iterator();
            while(gbtTimeBaseIterator.hasNext()){
                GbtTimeBase gbtTimeBase = gbtTimeBaseIterator.next();
                byte timeBaseId =(byte)gbtTimeBase.getTimeBaseId();
                byte[] monthFlagtemp = ByteUtils.intToByte(gbtTimeBase.getMonth());
                byte[] monthFlag = new byte[2];
                monthFlag[0] = monthFlagtemp[0];
                monthFlag[1] = monthFlagtemp[1];
                byte weekFlag = (byte)gbtTimeBase.getWeek();
                byte[] dayfl = ByteUtils.longToByte(gbtTimeBase.getDay());
                byte[] dayFlag = new byte[4];
                dayFlag[0] = dayfl[0];
                dayFlag[1] = dayfl[1];
                dayFlag[2] = dayfl[2];
                dayFlag[3] = dayfl[3];
                byte scheduleId = (byte)gbtTimeBase.getScheduleId();
                hex = ArrayUtils.add(hex,timeBaseId);
                hex = ArrayUtils.addAll(hex,monthFlag);
                hex = ArrayUtils.add(hex,weekFlag);
                hex = ArrayUtils.addAll(hex,dayFlag);
                hex = ArrayUtils.add(hex,scheduleId);
                //byte[] objectArray = ArrayUtils.addAll(phaseId,flag);
                //hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
            message = CheckGbt.check(bytes);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }


}
