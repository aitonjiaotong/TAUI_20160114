package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipTimeBaseScheduleTable")
public class NtcipTimeBaseScheduleTable {

    private int id;

    private int deviceId;

    private int timeBaseScheduleNumber;

    private int timeBaseScheduleMonth;

    private int timeBaseScheduleDay;

    private int timeBaseScheduleDate;


    private int timeBaseScheduleDayPlan;

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

    public int getTimeBaseScheduleNumber() {
        return timeBaseScheduleNumber;
    }

    public void setTimeBaseScheduleNumber(int timeBaseScheduleNumber) {
        this.timeBaseScheduleNumber = timeBaseScheduleNumber;
    }

    public int getTimeBaseScheduleMonth() {
        return timeBaseScheduleMonth;
    }

    public void setTimeBaseScheduleMonth(int timeBaseScheduleMonth) {
        this.timeBaseScheduleMonth = timeBaseScheduleMonth;
    }

    public int getTimeBaseScheduleDay() {
        return timeBaseScheduleDay;
    }

    public void setTimeBaseScheduleDay(int timeBaseScheduleDay) {
        this.timeBaseScheduleDay = timeBaseScheduleDay;
    }

    public int getTimeBaseScheduleDate() {
        return timeBaseScheduleDate;
    }

    public void setTimeBaseScheduleDate(int timeBaseScheduleDate) {
        this.timeBaseScheduleDate = timeBaseScheduleDate;
    }

    public int getTimeBaseScheduleDayPlan() {
        return timeBaseScheduleDayPlan;
    }

    public void setTimeBaseScheduleDayPlan(int timeBaseScheduleDayPlan) {
        this.timeBaseScheduleDayPlan = timeBaseScheduleDayPlan;
    }
}
