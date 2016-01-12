package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipGlobalReport")
public class NtcipGlobalReport {

    private int id;

    private int deviceId;

    private int maxEventClasses;

    private int eventClassTable;

    private int maxEventLogConfigs;

    private int eventLogConfigTable;

    private int maxEventLogSize;

    private int eventLogTable;

    private int numEvents;

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

    public int getMaxEventClasses() {
        return maxEventClasses;
    }

    public void setMaxEventClasses(int maxEventClasses) {
        this.maxEventClasses = maxEventClasses;
    }

    public int getEventClassTable() {
        return eventClassTable;
    }

    public void setEventClassTable(int eventClassTable) {
        this.eventClassTable = eventClassTable;
    }

    public int getMaxEventLogConfigs() {
        return maxEventLogConfigs;
    }

    public void setMaxEventLogConfigs(int maxEventLogConfigs) {
        this.maxEventLogConfigs = maxEventLogConfigs;
    }

    public int getEventLogConfigTable() {
        return eventLogConfigTable;
    }

    public void setEventLogConfigTable(int eventLogConfigTable) {
        this.eventLogConfigTable = eventLogConfigTable;
    }

    public int getMaxEventLogSize() {
        return maxEventLogSize;
    }

    public void setMaxEventLogSize(int maxEventLogSize) {
        this.maxEventLogSize = maxEventLogSize;
    }

    public int getEventLogTable() {
        return eventLogTable;
    }

    public void setEventLogTable(int eventLogTable) {
        this.eventLogTable = eventLogTable;
    }

    public int getNumEvents() {
        return numEvents;
    }

    public void setNumEvents(int numEvents) {
        this.numEvents = numEvents;
    }
}
