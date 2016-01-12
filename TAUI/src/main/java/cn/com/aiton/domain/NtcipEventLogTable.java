package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipEventLogTable")
public class NtcipEventLogTable {

    private int  id;

    private int deviceId;

    private int eventLogClass;

    private int eventLogNumber;

    private int eventLogID;

    private long eventLogTime;

    private long eventLogValue;

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

    public int getEventLogClass() {
        return eventLogClass;
    }

    public void setEventLogClass(int eventLogClass) {
        this.eventLogClass = eventLogClass;
    }

    public int getEventLogNumber() {
        return eventLogNumber;
    }

    public void setEventLogNumber(int eventLogNumber) {
        this.eventLogNumber = eventLogNumber;
    }

    public int getEventLogID() {
        return eventLogID;
    }

    public void setEventLogID(int eventLogID) {
        this.eventLogID = eventLogID;
    }

    public long getEventLogTime() {
        return eventLogTime;
    }

    public void setEventLogTime(long eventLogTime) {
        this.eventLogTime = eventLogTime;
    }

    public long getEventLogValue() {
        return eventLogValue;
    }

    public void setEventLogValue(long eventLogValue) {
        this.eventLogValue = eventLogValue;
    }
}
