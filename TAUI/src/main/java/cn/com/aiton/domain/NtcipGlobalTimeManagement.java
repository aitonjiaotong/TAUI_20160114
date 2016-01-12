package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

import java.util.Date;

@Table(name = "NtcipGlobalTimeManagement")
public class NtcipGlobalTimeManagement {

    private int id;

    private int deviceId;

    private long globalTime;

    private int globalDaylightSaving;

    private int DayPlan;

    private int timebase;

    private long standardTimeZone;

    private long localTime;

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

    public long getGlobalTime() {
        return globalTime;
    }

    public void setGlobalTime(long globalTime) {
        this.globalTime = globalTime;
    }

    public int getGlobalDaylightSaving() {
        return globalDaylightSaving;
    }

    public void setGlobalDaylightSaving(int globalDaylightSaving) {
        this.globalDaylightSaving = globalDaylightSaving;
    }

    public int getDayPlan() {
        return DayPlan;
    }

    public void setDayPlan(int dayPlan) {
        DayPlan = dayPlan;
    }

    public int getTimebase() {
        return timebase;
    }

    public void setTimebase(int timebase) {
        this.timebase = timebase;
    }

    public long getStandardTimeZone() {
        return standardTimeZone;
    }

    public void setStandardTimeZone(long standardTimeZone) {
        this.standardTimeZone = standardTimeZone;
    }

    public long getLocalTime() {
        return localTime;
    }

    public void setLocalTime(long localTime) {
        this.localTime = localTime;
    }
}
