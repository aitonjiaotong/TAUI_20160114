package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipTimebase")
public class NtcipTimebase {

    private int id;

    private int deviceId;

    private int maxTimeBaseScheduleEntries;

    private int timeBaseScheduleTable;

    private int timeBaseScheduleTablestatus;

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

    public int getMaxTimeBaseScheduleEntries() {
        return maxTimeBaseScheduleEntries;
    }

    public void setMaxTimeBaseScheduleEntries(int maxTimeBaseScheduleEntries) {
        this.maxTimeBaseScheduleEntries = maxTimeBaseScheduleEntries;
    }

    public int getTimeBaseScheduleTable() {
        return timeBaseScheduleTable;
    }

    public void setTimeBaseScheduleTable(int timeBaseScheduleTable) {
        this.timeBaseScheduleTable = timeBaseScheduleTable;
    }

    public int getTimeBaseScheduleTablestatus() {
        return timeBaseScheduleTablestatus;
    }

    public void setTimeBaseScheduleTablestatus(int timeBaseScheduleTablestatus) {
        this.timeBaseScheduleTablestatus = timeBaseScheduleTablestatus;
    }
}
