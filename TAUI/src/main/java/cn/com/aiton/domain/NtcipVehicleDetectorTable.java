package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipVehicleDetectorTable")
public class NtcipVehicleDetectorTable {

    private int id;

    private int deviceId;

    private int vehicleDetectorNumber;

    private int vehicleDetectorOptions;

    private int vehicleDetectorCallPhase;

    private int vehicleDetectorSwitchPhase;

    private int vehicleDetectorDelay;

    private int vehicleDetectorExtend;

    private int vehicleDetectorQueueLimit;

    private int vehicleDetectorNoActivity;

    private int vehicleDetectorMaxPresence;

    private int vehicleDetectorErraticCounts;

    private int vehicleDetectorFailTime;

    private int vehicleDetectorAlarms;

    private int vehicleDetectorReportedAlarms;


    private int vehicleDetectorReset;

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

    public int getVehicleDetectorNumber() {
        return vehicleDetectorNumber;
    }

    public void setVehicleDetectorNumber(int vehicleDetectorNumber) {
        this.vehicleDetectorNumber = vehicleDetectorNumber;
    }

    public int getVehicleDetectorOptions() {
        return vehicleDetectorOptions;
    }

    public void setVehicleDetectorOptions(int vehicleDetectorOptions) {
        this.vehicleDetectorOptions = vehicleDetectorOptions;
    }

    public int getVehicleDetectorCallPhase() {
        return vehicleDetectorCallPhase;
    }

    public void setVehicleDetectorCallPhase(int vehicleDetectorCallPhase) {
        this.vehicleDetectorCallPhase = vehicleDetectorCallPhase;
    }

    public int getVehicleDetectorSwitchPhase() {
        return vehicleDetectorSwitchPhase;
    }

    public void setVehicleDetectorSwitchPhase(int vehicleDetectorSwitchPhase) {
        this.vehicleDetectorSwitchPhase = vehicleDetectorSwitchPhase;
    }

    public int getVehicleDetectorDelay() {
        return vehicleDetectorDelay;
    }

    public void setVehicleDetectorDelay(int vehicleDetectorDelay) {
        this.vehicleDetectorDelay = vehicleDetectorDelay;
    }

    public int getVehicleDetectorExtend() {
        return vehicleDetectorExtend;
    }

    public void setVehicleDetectorExtend(int vehicleDetectorExtend) {
        this.vehicleDetectorExtend = vehicleDetectorExtend;
    }

    public int getVehicleDetectorQueueLimit() {
        return vehicleDetectorQueueLimit;
    }

    public void setVehicleDetectorQueueLimit(int vehicleDetectorQueueLimit) {
        this.vehicleDetectorQueueLimit = vehicleDetectorQueueLimit;
    }

    public int getVehicleDetectorNoActivity() {
        return vehicleDetectorNoActivity;
    }

    public void setVehicleDetectorNoActivity(int vehicleDetectorNoActivity) {
        this.vehicleDetectorNoActivity = vehicleDetectorNoActivity;
    }

    public int getVehicleDetectorMaxPresence() {
        return vehicleDetectorMaxPresence;
    }

    public void setVehicleDetectorMaxPresence(int vehicleDetectorMaxPresence) {
        this.vehicleDetectorMaxPresence = vehicleDetectorMaxPresence;
    }

    public int getVehicleDetectorErraticCounts() {
        return vehicleDetectorErraticCounts;
    }

    public void setVehicleDetectorErraticCounts(int vehicleDetectorErraticCounts) {
        this.vehicleDetectorErraticCounts = vehicleDetectorErraticCounts;
    }

    public int getVehicleDetectorFailTime() {
        return vehicleDetectorFailTime;
    }

    public void setVehicleDetectorFailTime(int vehicleDetectorFailTime) {
        this.vehicleDetectorFailTime = vehicleDetectorFailTime;
    }

    public int getVehicleDetectorAlarms() {
        return vehicleDetectorAlarms;
    }

    public void setVehicleDetectorAlarms(int vehicleDetectorAlarms) {
        this.vehicleDetectorAlarms = vehicleDetectorAlarms;
    }

    public int getVehicleDetectorReportedAlarms() {
        return vehicleDetectorReportedAlarms;
    }

    public void setVehicleDetectorReportedAlarms(int vehicleDetectorReportedAlarms) {
        this.vehicleDetectorReportedAlarms = vehicleDetectorReportedAlarms;
    }

    public int getVehicleDetectorReset() {
        return vehicleDetectorReset;
    }

    public void setVehicleDetectorReset(int vehicleDetectorReset) {
        this.vehicleDetectorReset = vehicleDetectorReset;
    }
}
