package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipRingControlGroupTable")
public class NtcipRingControlGroupTable {

    private int id;

    private int deviceId;

    private int ringControlGroupNumber;

    private int ringControlGroupStopTime;

    private int ringControlGroupForceOff;

    private int ringControlGroupMax2;

    private int ringControlGroupMaxInhibit;

    private int ringControlGroupPedRecycle;

    private int ringControlGroupRedRest;


    private int ringControlGroupOmitRedClear;

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

    public int getRingControlGroupNumber() {
        return ringControlGroupNumber;
    }

    public void setRingControlGroupNumber(int ringControlGroupNumber) {
        this.ringControlGroupNumber = ringControlGroupNumber;
    }

    public int getRingControlGroupStopTime() {
        return ringControlGroupStopTime;
    }

    public void setRingControlGroupStopTime(int ringControlGroupStopTime) {
        this.ringControlGroupStopTime = ringControlGroupStopTime;
    }

    public int getRingControlGroupForceOff() {
        return ringControlGroupForceOff;
    }

    public void setRingControlGroupForceOff(int ringControlGroupForceOff) {
        this.ringControlGroupForceOff = ringControlGroupForceOff;
    }

    public int getRingControlGroupMax2() {
        return ringControlGroupMax2;
    }

    public void setRingControlGroupMax2(int ringControlGroupMax2) {
        this.ringControlGroupMax2 = ringControlGroupMax2;
    }

    public int getRingControlGroupMaxInhibit() {
        return ringControlGroupMaxInhibit;
    }

    public void setRingControlGroupMaxInhibit(int ringControlGroupMaxInhibit) {
        this.ringControlGroupMaxInhibit = ringControlGroupMaxInhibit;
    }

    public int getRingControlGroupPedRecycle() {
        return ringControlGroupPedRecycle;
    }

    public void setRingControlGroupPedRecycle(int ringControlGroupPedRecycle) {
        this.ringControlGroupPedRecycle = ringControlGroupPedRecycle;
    }

    public int getRingControlGroupRedRest() {
        return ringControlGroupRedRest;
    }

    public void setRingControlGroupRedRest(int ringControlGroupRedRest) {
        this.ringControlGroupRedRest = ringControlGroupRedRest;
    }

    public int getRingControlGroupOmitRedClear() {
        return ringControlGroupOmitRedClear;
    }

    public void setRingControlGroupOmitRedClear(int ringControlGroupOmitRedClear) {
        this.ringControlGroupOmitRedClear = ringControlGroupOmitRedClear;
    }
}
