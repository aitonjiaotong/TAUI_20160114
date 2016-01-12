package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipEventClassTable")
public class NtcipEventClassTable {

    private int id;

    private int deviceId;

    private int eventClassNumber;

    private  int eventClassLimit;

    private int eventClassClearTime;

    private String eventClassDescription;

    private int eventClassNumRowsInLog;

    private  int eventClassNumEvents;

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

    public int getEventClassNumber() {
        return eventClassNumber;
    }

    public void setEventClassNumber(int eventClassNumber) {
        this.eventClassNumber = eventClassNumber;
    }

    public int getEventClassLimit() {
        return eventClassLimit;
    }

    public void setEventClassLimit(int eventClassLimit) {
        this.eventClassLimit = eventClassLimit;
    }

    public int getEventClassClearTime() {
        return eventClassClearTime;
    }

    public void setEventClassClearTime(int eventClassClearTime) {
        this.eventClassClearTime = eventClassClearTime;
    }

    public String getEventClassDescription() {
        return eventClassDescription;
    }

    public void setEventClassDescription(String eventClassDescription) {
        this.eventClassDescription = eventClassDescription;
    }

    public int getEventClassNumRowsInLog() {
        return eventClassNumRowsInLog;
    }

    public void setEventClassNumRowsInLog(int eventClassNumRowsInLog) {
        this.eventClassNumRowsInLog = eventClassNumRowsInLog;
    }

    public int getEventClassNumEvents() {
        return eventClassNumEvents;
    }

    public void setEventClassNumEvents(int eventClassNumEvents) {
        this.eventClassNumEvents = eventClassNumEvents;
    }
}
