package cn.com.aiton.services.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.com.aiton.domain.GbtEventLog;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.LogEventService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.DateTimeUtils;
import cn.com.aiton.utils.EventLogUtils;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class LogEventServiceImpl implements LogEventService {
    /**
     * 取得一个节点的所有日志数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtEventLog> getEventLog(TscNode node) {
        List<GbtEventLog> gbtEventLogs = new ArrayList<GbtEventLog>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_EVENT_LOG);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[6] * GbtDefine.EVENT_LOG_BYTE_SIZE];
            System.arraycopy(bytes,7,objectArray,0,objectArray.length);
            byte[][] eventLogResult = ByteUtils.oneArrayToTwoArray(objectArray,bytes[6],GbtDefine.EVENT_LOG_BYTE_SIZE);
            GbtEventLog gbtEventLog = null;
            for(int i=0; i<bytes[6]; i++){
                gbtEventLog = new GbtEventLog();
                gbtEventLog.setDeviceId(node.getId());
                gbtEventLog.setLogId(ByteUtils.bytesUInt(eventLogResult[i][0]));
                gbtEventLog.setEventType(ByteUtils.bytesUInt(eventLogResult[i][1]));
                gbtEventLog.setHappenTime((eventLogResult[i][2] << 24)+(eventLogResult[i][3] << 16) + (eventLogResult[i][4] << 8) + (eventLogResult[i][5]));
                gbtEventLog.setEventValue((eventLogResult[i][6] << 24) + (eventLogResult[i][7] << 16) + (eventLogResult[i][8] << 8) +(eventLogResult[i][9]));
                gbtEventLog.setEventLogDesc(EventLogUtils.eventDescToString(gbtEventLog.getEventValue(), (byte)gbtEventLog.getEventType()));
                gbtEventLog.setEventTime(DateTimeUtils.utcToLocalTimeString(gbtEventLog.getHappenTime()));
                gbtEventLogs.add(gbtEventLog);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtEventLogs;
    }

    /**
     * 根据时间取得日志，这个时间是哪一天。
     *
     * @param node
     * @param date
     * @return
     */
    @Override
    public List<GbtEventLog> getEventLogByTime(TscNode node, Date date) {
        return null;
    }

    /**
     * 根据日志类型读取日志数据
     *
     * @param node
     * @param type
     * @return
     */
    @Override
    public List<GbtEventLog> getEventLogByEventType(TscNode node, byte type) {
        return null;
    }

    /**
     * 根据两个时间，将开始时间和结束时间内的日志数据读取出来
     *
     * @param node
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public List<GbtEventLog> getEventLogByStartTimeAndEndTime(TscNode node, Date startTime, Date endTime) {
        return null;
    }
}
