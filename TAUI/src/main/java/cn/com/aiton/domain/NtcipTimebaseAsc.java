package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipTimebaseAsc")
public class NtcipTimebaseAsc {

    private int id;

    private int deviceId;

    private int timebasePatternSync;

    private int maxTimebaseAscActions;

    private int timebaseAscActionTable;

    private int timebaseAscActionStatus;

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

    public int getTimebasePatternSync() {
        return timebasePatternSync;
    }

    public void setTimebasePatternSync(int timebasePatternSync) {
        this.timebasePatternSync = timebasePatternSync;
    }

    public int getMaxTimebaseAscActions() {
        return maxTimebaseAscActions;
    }

    public void setMaxTimebaseAscActions(int maxTimebaseAscActions) {
        this.maxTimebaseAscActions = maxTimebaseAscActions;
    }

    public int getTimebaseAscActionTable() {
        return timebaseAscActionTable;
    }

    public void setTimebaseAscActionTable(int timebaseAscActionTable) {
        this.timebaseAscActionTable = timebaseAscActionTable;
    }

    public int getTimebaseAscActionStatus() {
        return timebaseAscActionStatus;
    }

    public void setTimebaseAscActionStatus(int timebaseAscActionStatus) {
        this.timebaseAscActionStatus = timebaseAscActionStatus;
    }
}
