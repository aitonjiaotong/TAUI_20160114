package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtEventLog")
public class GbtEventLog {

    private int id;

    private int deviceId;

    private int logId;

    private int eventType;

    private long happenTime;

    private long eventValue;

    private String eventTime;

    private String eventLogDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public long getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(long happenTime) {
        this.happenTime = happenTime;
    }

    public long getEventValue() {
        return eventValue;
    }

    public void setEventValue(long eventValue) {
        this.eventValue = eventValue;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventLogDesc() {
        return eventLogDesc;
    }

    public void setEventLogDesc(String eventLogDesc) {
        this.eventLogDesc = eventLogDesc;
    }
}
