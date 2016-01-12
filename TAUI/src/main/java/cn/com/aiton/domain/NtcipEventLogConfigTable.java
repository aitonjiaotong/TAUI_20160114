package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipEventLogConfigTable")
public class NtcipEventLogConfigTable {

    private int  id;

    private int  deviceId;

    private int eventConfigID;

    private int eventConfigClass;

    private int eventConfigMode;

    private int eventConfigCompareValue;

    private String eventConfigCompareOID;

    private String eventConfigLogOID;

    private int eventConfigAction;

    private int eventConfigStatus;

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

    public int getEventConfigID() {
        return eventConfigID;
    }

    public void setEventConfigID(int eventConfigID) {
        this.eventConfigID = eventConfigID;
    }

    public int getEventConfigClass() {
        return eventConfigClass;
    }

    public void setEventConfigClass(int eventConfigClass) {
        this.eventConfigClass = eventConfigClass;
    }

    public int getEventConfigMode() {
        return eventConfigMode;
    }

    public void setEventConfigMode(int eventConfigMode) {
        this.eventConfigMode = eventConfigMode;
    }

    public int getEventConfigCompareValue() {
        return eventConfigCompareValue;
    }

    public void setEventConfigCompareValue(int eventConfigCompareValue) {
        this.eventConfigCompareValue = eventConfigCompareValue;
    }

    public String getEventConfigCompareOID() {
        return eventConfigCompareOID;
    }

    public void setEventConfigCompareOID(String eventConfigCompareOID) {
        this.eventConfigCompareOID = eventConfigCompareOID;
    }

    public String getEventConfigLogOID() {
        return eventConfigLogOID;
    }

    public void setEventConfigLogOID(String eventConfigLogOID) {
        this.eventConfigLogOID = eventConfigLogOID;
    }

    public int getEventConfigAction() {
        return eventConfigAction;
    }

    public void setEventConfigAction(int eventConfigAction) {
        this.eventConfigAction = eventConfigAction;
    }

    public int getEventConfigStatus() {
        return eventConfigStatus;
    }

    public void setEventConfigStatus(int eventConfigStatus) {
        this.eventConfigStatus = eventConfigStatus;
    }
}
