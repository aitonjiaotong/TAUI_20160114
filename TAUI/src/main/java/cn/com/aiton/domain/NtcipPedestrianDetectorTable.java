package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPedestrianDetectorTable")
public class NtcipPedestrianDetectorTable {

    private int id;

    private int deviceId;

    private int pedestrianDetectorNumber;

    private int pedestrianDetectorCallPhase;

    private int pedestrianDetectorNoActivity;

    private int pedestrianDetectorMaxPresence;

    private int pedestrianDetectorErraticCounts;

    private int pedestrianDetectorAlarms;

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

    public int getPedestrianDetectorNumber() {
        return pedestrianDetectorNumber;
    }

    public void setPedestrianDetectorNumber(int pedestrianDetectorNumber) {
        this.pedestrianDetectorNumber = pedestrianDetectorNumber;
    }

    public int getPedestrianDetectorCallPhase() {
        return pedestrianDetectorCallPhase;
    }

    public void setPedestrianDetectorCallPhase(int pedestrianDetectorCallPhase) {
        this.pedestrianDetectorCallPhase = pedestrianDetectorCallPhase;
    }

    public int getPedestrianDetectorNoActivity() {
        return pedestrianDetectorNoActivity;
    }

    public void setPedestrianDetectorNoActivity(int pedestrianDetectorNoActivity) {
        this.pedestrianDetectorNoActivity = pedestrianDetectorNoActivity;
    }

    public int getPedestrianDetectorMaxPresence() {
        return pedestrianDetectorMaxPresence;
    }

    public void setPedestrianDetectorMaxPresence(int pedestrianDetectorMaxPresence) {
        this.pedestrianDetectorMaxPresence = pedestrianDetectorMaxPresence;
    }

    public int getPedestrianDetectorErraticCounts() {
        return pedestrianDetectorErraticCounts;
    }

    public void setPedestrianDetectorErraticCounts(int pedestrianDetectorErraticCounts) {
        this.pedestrianDetectorErraticCounts = pedestrianDetectorErraticCounts;
    }

    public int getPedestrianDetectorAlarms() {
        return pedestrianDetectorAlarms;
    }

    public void setPedestrianDetectorAlarms(int pedestrianDetectorAlarms) {
        this.pedestrianDetectorAlarms = pedestrianDetectorAlarms;
    }
}
