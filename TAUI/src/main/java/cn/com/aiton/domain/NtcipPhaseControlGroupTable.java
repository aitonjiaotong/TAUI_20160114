package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPhaseControlGroupTable")
public class NtcipPhaseControlGroupTable {

    private int id;

    private int deviceId;

    private int phaseControlGroupNumber;

    private int phaseControlGroupPhaseOmit;

    private int phaseControlGroupPedOmit;

    private int phaseControlGroupHold;

    private int phaseControlGroupForceOff;

    private  int phaseControlGroupVehCall;

    private int phaseControlGroupPedCall;

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

    public int getPhaseControlGroupNumber() {
        return phaseControlGroupNumber;
    }

    public void setPhaseControlGroupNumber(int phaseControlGroupNumber) {
        this.phaseControlGroupNumber = phaseControlGroupNumber;
    }

    public int getPhaseControlGroupPhaseOmit() {
        return phaseControlGroupPhaseOmit;
    }

    public void setPhaseControlGroupPhaseOmit(int phaseControlGroupPhaseOmit) {
        this.phaseControlGroupPhaseOmit = phaseControlGroupPhaseOmit;
    }

    public int getPhaseControlGroupPedOmit() {
        return phaseControlGroupPedOmit;
    }

    public void setPhaseControlGroupPedOmit(int phaseControlGroupPedOmit) {
        this.phaseControlGroupPedOmit = phaseControlGroupPedOmit;
    }

    public int getPhaseControlGroupHold() {
        return phaseControlGroupHold;
    }

    public void setPhaseControlGroupHold(int phaseControlGroupHold) {
        this.phaseControlGroupHold = phaseControlGroupHold;
    }

    public int getPhaseControlGroupForceOff() {
        return phaseControlGroupForceOff;
    }

    public void setPhaseControlGroupForceOff(int phaseControlGroupForceOff) {
        this.phaseControlGroupForceOff = phaseControlGroupForceOff;
    }

    public int getPhaseControlGroupVehCall() {
        return phaseControlGroupVehCall;
    }

    public void setPhaseControlGroupVehCall(int phaseControlGroupVehCall) {
        this.phaseControlGroupVehCall = phaseControlGroupVehCall;
    }

    public int getPhaseControlGroupPedCall() {
        return phaseControlGroupPedCall;
    }

    public void setPhaseControlGroupPedCall(int phaseControlGroupPedCall) {
        this.phaseControlGroupPedCall = phaseControlGroupPedCall;
    }
}
