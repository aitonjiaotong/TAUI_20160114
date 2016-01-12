package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipPreemptTable")
public class NtcipPreemptTable {

    private int id;

    private int deviceId;

    private int preemptNumber;

    private int preemptControl;

    private int preemptLink;

    private int preemptDelay;

    private int preemptMinimumDuration;

    private int preemptMinimumGreen;

    private int preemptMinimumWalk;

    private int preemptEnterPedClear;

    private int preemptTrackGreen;

    private int preemptDwellGreen;

    private int preemptMaximumPresence;

    private String preemptTrackPhase;

    private String preemptDwellPhase;

    private String preemptDwellPed;

    private String preemptExitPhase;

    private int preemptState;

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

    public int getPreemptNumber() {
        return preemptNumber;
    }

    public void setPreemptNumber(int preemptNumber) {
        this.preemptNumber = preemptNumber;
    }

    public int getPreemptControl() {
        return preemptControl;
    }

    public void setPreemptControl(int preemptControl) {
        this.preemptControl = preemptControl;
    }

    public int getPreemptLink() {
        return preemptLink;
    }

    public void setPreemptLink(int preemptLink) {
        this.preemptLink = preemptLink;
    }

    public int getPreemptDelay() {
        return preemptDelay;
    }

    public void setPreemptDelay(int preemptDelay) {
        this.preemptDelay = preemptDelay;
    }

    public int getPreemptMinimumDuration() {
        return preemptMinimumDuration;
    }

    public void setPreemptMinimumDuration(int preemptMinimumDuration) {
        this.preemptMinimumDuration = preemptMinimumDuration;
    }

    public int getPreemptMinimumGreen() {
        return preemptMinimumGreen;
    }

    public void setPreemptMinimumGreen(int preemptMinimumGreen) {
        this.preemptMinimumGreen = preemptMinimumGreen;
    }

    public int getPreemptMinimumWalk() {
        return preemptMinimumWalk;
    }

    public void setPreemptMinimumWalk(int preemptMinimumWalk) {
        this.preemptMinimumWalk = preemptMinimumWalk;
    }

    public int getPreemptEnterPedClear() {
        return preemptEnterPedClear;
    }

    public void setPreemptEnterPedClear(int preemptEnterPedClear) {
        this.preemptEnterPedClear = preemptEnterPedClear;
    }

    public int getPreemptTrackGreen() {
        return preemptTrackGreen;
    }

    public void setPreemptTrackGreen(int preemptTrackGreen) {
        this.preemptTrackGreen = preemptTrackGreen;
    }

    public int getPreemptDwellGreen() {
        return preemptDwellGreen;
    }

    public void setPreemptDwellGreen(int preemptDwellGreen) {
        this.preemptDwellGreen = preemptDwellGreen;
    }

    public int getPreemptMaximumPresence() {
        return preemptMaximumPresence;
    }

    public void setPreemptMaximumPresence(int preemptMaximumPresence) {
        this.preemptMaximumPresence = preemptMaximumPresence;
    }

    public String getPreemptTrackPhase() {
        return preemptTrackPhase;
    }

    public void setPreemptTrackPhase(String preemptTrackPhase) {
        this.preemptTrackPhase = preemptTrackPhase;
    }

    public String getPreemptDwellPhase() {
        return preemptDwellPhase;
    }

    public void setPreemptDwellPhase(String preemptDwellPhase) {
        this.preemptDwellPhase = preemptDwellPhase;
    }

    public String getPreemptDwellPed() {
        return preemptDwellPed;
    }

    public void setPreemptDwellPed(String preemptDwellPed) {
        this.preemptDwellPed = preemptDwellPed;
    }

    public String getPreemptExitPhase() {
        return preemptExitPhase;
    }

    public void setPreemptExitPhase(String preemptExitPhase) {
        this.preemptExitPhase = preemptExitPhase;
    }

    public int getPreemptState() {
        return preemptState;
    }

    public void setPreemptState(int preemptState) {
        this.preemptState = preemptState;
    }
}
