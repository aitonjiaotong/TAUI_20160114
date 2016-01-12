package cn.com.aiton.services.impl;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtSchedule;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.ScheduleService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class ScheduleServiceImpl implements ScheduleService {

    /**
     * 得到某个信号机的时段表数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtSchedule> getSchedule(TscNode node) {
        List<GbtSchedule> gbtSchedules = new ArrayList<GbtSchedule>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_SCHEDULE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[GbtDefine.SCHEDULE_EVENT_RESULT_LEN * GbtDefine.SCHEDULE_RESULT_LEN * GbtDefine.SCHEDULE_BYTE_SIZE];
            System.arraycopy(bytes,5,objectArray,0,objectArray.length);
            byte[][] scheduleArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.SCHEDULE_RESULT_LEN * GbtDefine.SCHEDULE_EVENT_RESULT_LEN, GbtDefine.SCHEDULE_BYTE_SIZE);
            for(int i=0; i< GbtDefine.SCHEDULE_EVENT_RESULT_LEN * GbtDefine.SCHEDULE_RESULT_LEN ;i++){
                GbtSchedule gbtSchedule = new GbtSchedule();
                gbtSchedule.setDeviceId(node.getId());
                gbtSchedule.setScheduleId(ByteUtils.bytesUInt(scheduleArrayResult[i][0]));
                gbtSchedule.setEventId(ByteUtils.bytesUInt(scheduleArrayResult[i][1]));
                gbtSchedule.setBeginHour(ByteUtils.bytesUInt(scheduleArrayResult[i][2]));
                gbtSchedule.setBeginMinute(ByteUtils.bytesUInt(scheduleArrayResult[i][3]));
                gbtSchedule.setControlMode(ByteUtils.bytesUInt(scheduleArrayResult[i][4]));
                gbtSchedule.setTimePatternId(ByteUtils.bytesUInt(scheduleArrayResult[i][5]));
                gbtSchedule.setAuxOut(ByteUtils.bytesUInt(scheduleArrayResult[i][6]));
                gbtSchedule.setSpecialOut(ByteUtils.bytesUInt(scheduleArrayResult[i][7]));

                gbtSchedules.add(gbtSchedule);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtSchedules;
    }

    /**
     * 保存某个信号机的时段数据
     *
     * @param node
     * @param gbtSchedules
     * @return
     */
    @Override
    public Message setSchedule(TscNode node, List<GbtSchedule> gbtSchedules) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_SCHEDULE_RESPONSE, (byte) gbtSchedules.size());
            Iterator<GbtSchedule> gbtScheduleIterator = gbtSchedules.iterator();
            while(gbtScheduleIterator.hasNext()){
                GbtSchedule gbtSchedule = gbtScheduleIterator.next();
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getScheduleId());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getEventId());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getBeginHour());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getBeginMinute());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getControlMode());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getTimePatternId());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getAuxOut());
                hex = ArrayUtils.add(hex,(byte)gbtSchedule.getSpecialOut());
                //hex = ArrayUtils.addAll(hex,objectArray);
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
           // byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
           // System.out.println("服务端回应数据：" + info);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }


}
