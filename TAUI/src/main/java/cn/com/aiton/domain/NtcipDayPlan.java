package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipDayPlan")
public class NtcipDayPlan {

    private int id;

    private int deviceId;

    private int maxDayPlans;

    private int maxDayPlanEvents;

    private int timeBaseDayPlanTable;

    private int dayPlanStatus;

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

    public int getMaxDayPlans() {
        return maxDayPlans;
    }

    public void setMaxDayPlans(int maxDayPlans) {
        this.maxDayPlans = maxDayPlans;
    }

    public int getMaxDayPlanEvents() {
        return maxDayPlanEvents;
    }

    public void setMaxDayPlanEvents(int maxDayPlanEvents) {
        this.maxDayPlanEvents = maxDayPlanEvents;
    }

    public int getTimeBaseDayPlanTable() {
        return timeBaseDayPlanTable;
    }

    public void setTimeBaseDayPlanTable(int timeBaseDayPlanTable) {
        this.timeBaseDayPlanTable = timeBaseDayPlanTable;
    }

    public int getDayPlanStatus() {
        return dayPlanStatus;
    }

    public void setDayPlanStatus(int dayPlanStatus) {
        this.dayPlanStatus = dayPlanStatus;
    }
}
