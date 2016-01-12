package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipSplitTable")
public class NtcipSplitTable {

    private int id;

    private int deviceId;

    private int splitNumber;

    private int splitPhase;

    private int splitTime;

    private int splitMode;

    private int splitCoordPhase;

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

    public int getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(int splitNumber) {
        this.splitNumber = splitNumber;
    }

    public int getSplitPhase() {
        return splitPhase;
    }

    public void setSplitPhase(int splitPhase) {
        this.splitPhase = splitPhase;
    }

    public int getSplitTime() {
        return splitTime;
    }

    public void setSplitTime(int splitTime) {
        this.splitTime = splitTime;
    }

    public int getSplitMode() {
        return splitMode;
    }

    public void setSplitMode(int splitMode) {
        this.splitMode = splitMode;
    }

    public int getSplitCoordPhase() {
        return splitCoordPhase;
    }

    public void setSplitCoordPhase(int splitCoordPhase) {
        this.splitCoordPhase = splitCoordPhase;
    }
}
