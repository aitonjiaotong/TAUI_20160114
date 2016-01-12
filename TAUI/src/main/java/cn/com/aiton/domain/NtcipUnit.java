package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipUnit")
public class NtcipUnit {

    private int id;

    private int deviceId;

    private int unitStartUpFlash;

    private int unitAutoPedestrianClear;

    private int unitBackupTime;

    private int unitRedRevert;

    private int unitControlStatus;

    private int unitFlashStatus;

    private int unitAlarmStatus2;

    private int unitAlarmStatus1;

    private int shortAlarmStatus;

    private int unitControl;


    private int maxAlarmGroups;

    private int alarmGroupTable;

    private int maxSpecialFunctionOutputs;

    private int specialFunctionOutputTable;

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

    public int getUnitStartUpFlash() {
        return unitStartUpFlash;
    }

    public void setUnitStartUpFlash(int unitStartUpFlash) {
        this.unitStartUpFlash = unitStartUpFlash;
    }

    public int getUnitAutoPedestrianClear() {
        return unitAutoPedestrianClear;
    }

    public void setUnitAutoPedestrianClear(int unitAutoPedestrianClear) {
        this.unitAutoPedestrianClear = unitAutoPedestrianClear;
    }

    public int getUnitBackupTime() {
        return unitBackupTime;
    }

    public void setUnitBackupTime(int unitBackupTime) {
        this.unitBackupTime = unitBackupTime;
    }

    public int getUnitRedRevert() {
        return unitRedRevert;
    }

    public void setUnitRedRevert(int unitRedRevert) {
        this.unitRedRevert = unitRedRevert;
    }

    public int getUnitControlStatus() {
        return unitControlStatus;
    }

    public void setUnitControlStatus(int unitControlStatus) {
        this.unitControlStatus = unitControlStatus;
    }

    public int getUnitFlashStatus() {
        return unitFlashStatus;
    }

    public void setUnitFlashStatus(int unitFlashStatus) {
        this.unitFlashStatus = unitFlashStatus;
    }

    public int getUnitAlarmStatus2() {
        return unitAlarmStatus2;
    }

    public void setUnitAlarmStatus2(int unitAlarmStatus2) {
        this.unitAlarmStatus2 = unitAlarmStatus2;
    }

    public int getUnitAlarmStatus1() {
        return unitAlarmStatus1;
    }

    public void setUnitAlarmStatus1(int unitAlarmStatus1) {
        this.unitAlarmStatus1 = unitAlarmStatus1;
    }

    public int getShortAlarmStatus() {
        return shortAlarmStatus;
    }

    public void setShortAlarmStatus(int shortAlarmStatus) {
        this.shortAlarmStatus = shortAlarmStatus;
    }

    public int getUnitControl() {
        return unitControl;
    }

    public void setUnitControl(int unitControl) {
        this.unitControl = unitControl;
    }

    public int getMaxAlarmGroups() {
        return maxAlarmGroups;
    }

    public void setMaxAlarmGroups(int maxAlarmGroups) {
        this.maxAlarmGroups = maxAlarmGroups;
    }

    public int getAlarmGroupTable() {
        return alarmGroupTable;
    }

    public void setAlarmGroupTable(int alarmGroupTable) {
        this.alarmGroupTable = alarmGroupTable;
    }

    public int getMaxSpecialFunctionOutputs() {
        return maxSpecialFunctionOutputs;
    }

    public void setMaxSpecialFunctionOutputs(int maxSpecialFunctionOutputs) {
        this.maxSpecialFunctionOutputs = maxSpecialFunctionOutputs;
    }

    public int getSpecialFunctionOutputTable() {
        return specialFunctionOutputTable;
    }

    public void setSpecialFunctionOutputTable(int specialFunctionOutputTable) {
        this.specialFunctionOutputTable = specialFunctionOutputTable;
    }
}
