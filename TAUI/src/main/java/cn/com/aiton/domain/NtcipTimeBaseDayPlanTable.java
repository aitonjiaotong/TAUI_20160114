package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipTimeBaseDayPlanTable")
public class NtcipTimeBaseDayPlanTable {

    private int id;

    private int deviceId;

    private int dayPlanNumber;

    private int dayPlanEventNumber;

    private int dayPlanHour;

    private int dayPlanMinute;

    private String dayPlanActionNumberOID;

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

    public int getDayPlanNumber() {
        return dayPlanNumber;
    }

    public void setDayPlanNumber(int dayPlanNumber) {
        this.dayPlanNumber = dayPlanNumber;
    }

    public int getDayPlanEventNumber() {
        return dayPlanEventNumber;
    }

    public void setDayPlanEventNumber(int dayPlanEventNumber) {
        this.dayPlanEventNumber = dayPlanEventNumber;
    }

    public int getDayPlanHour() {
        return dayPlanHour;
    }

    public void setDayPlanHour(int dayPlanHour) {
        this.dayPlanHour = dayPlanHour;
    }

    public int getDayPlanMinute() {
        return dayPlanMinute;
    }

    public void setDayPlanMinute(int dayPlanMinute) {
        this.dayPlanMinute = dayPlanMinute;
    }

    public String getDayPlanActionNumberOID() {
        return dayPlanActionNumberOID;
    }

    public void setDayPlanActionNumberOID(String dayPlanActionNumberOID) {
        this.dayPlanActionNumberOID = dayPlanActionNumberOID;
    }
}
