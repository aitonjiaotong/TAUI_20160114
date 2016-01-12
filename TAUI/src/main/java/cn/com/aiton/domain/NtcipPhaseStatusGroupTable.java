package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPhaseStatusGroupTable")
public class NtcipPhaseStatusGroupTable {

    private int id;

    private int deviceId;

    private int phaseStatusGroupNumber;

    private int phaseStatusGroupReds;

    private int phaseStatusGroupYellows;

    private int phaseStatusGroupGreens;

    private int phaseStatusGroupDontWalks;

    private int phaseStatusGroupPedClears;

    private int phaseStatusGroupWalks;

    private int phaseStatusGroupVehCalls;

    private int phaseStatusGroupPedCalls;

    private int phaseStatusGroupPhaseOns;

    private int phaseStatusGroupPhaseNexts;

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

    public int getPhaseStatusGroupNumber() {
        return phaseStatusGroupNumber;
    }

    public void setPhaseStatusGroupNumber(int phaseStatusGroupNumber) {
        this.phaseStatusGroupNumber = phaseStatusGroupNumber;
    }

    public int getPhaseStatusGroupReds() {
        return phaseStatusGroupReds;
    }

    public void setPhaseStatusGroupReds(int phaseStatusGroupReds) {
        this.phaseStatusGroupReds = phaseStatusGroupReds;
    }

    public int getPhaseStatusGroupYellows() {
        return phaseStatusGroupYellows;
    }

    public void setPhaseStatusGroupYellows(int phaseStatusGroupYellows) {
        this.phaseStatusGroupYellows = phaseStatusGroupYellows;
    }

    public int getPhaseStatusGroupGreens() {
        return phaseStatusGroupGreens;
    }

    public void setPhaseStatusGroupGreens(int phaseStatusGroupGreens) {
        this.phaseStatusGroupGreens = phaseStatusGroupGreens;
    }

    public int getPhaseStatusGroupDontWalks() {
        return phaseStatusGroupDontWalks;
    }

    public void setPhaseStatusGroupDontWalks(int phaseStatusGroupDontWalks) {
        this.phaseStatusGroupDontWalks = phaseStatusGroupDontWalks;
    }

    public int getPhaseStatusGroupPedClears() {
        return phaseStatusGroupPedClears;
    }

    public void setPhaseStatusGroupPedClears(int phaseStatusGroupPedClears) {
        this.phaseStatusGroupPedClears = phaseStatusGroupPedClears;
    }

    public int getPhaseStatusGroupWalks() {
        return phaseStatusGroupWalks;
    }

    public void setPhaseStatusGroupWalks(int phaseStatusGroupWalks) {
        this.phaseStatusGroupWalks = phaseStatusGroupWalks;
    }

    public int getPhaseStatusGroupVehCalls() {
        return phaseStatusGroupVehCalls;
    }

    public void setPhaseStatusGroupVehCalls(int phaseStatusGroupVehCalls) {
        this.phaseStatusGroupVehCalls = phaseStatusGroupVehCalls;
    }

    public int getPhaseStatusGroupPedCalls() {
        return phaseStatusGroupPedCalls;
    }

    public void setPhaseStatusGroupPedCalls(int phaseStatusGroupPedCalls) {
        this.phaseStatusGroupPedCalls = phaseStatusGroupPedCalls;
    }

    public int getPhaseStatusGroupPhaseOns() {
        return phaseStatusGroupPhaseOns;
    }

    public void setPhaseStatusGroupPhaseOns(int phaseStatusGroupPhaseOns) {
        this.phaseStatusGroupPhaseOns = phaseStatusGroupPhaseOns;
    }

    public int getPhaseStatusGroupPhaseNexts() {
        return phaseStatusGroupPhaseNexts;
    }

    public void setPhaseStatusGroupPhaseNexts(int phaseStatusGroupPhaseNexts) {
        this.phaseStatusGroupPhaseNexts = phaseStatusGroupPhaseNexts;
    }
}
