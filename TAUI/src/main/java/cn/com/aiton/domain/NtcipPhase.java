package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPhase")
public class NtcipPhase {

    private int id;

    private int deviceId;

    private int maxPhases;

    private int phaseTable;

    private int maxPhaseGroups;

    private int phaseStatusGroupTable;

    private int phaseControlGroupTable;

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

    public int getMaxPhases() {
        return maxPhases;
    }

    public void setMaxPhases(int maxPhases) {
        this.maxPhases = maxPhases;
    }

    public int getPhaseTable() {
        return phaseTable;
    }

    public void setPhaseTable(int phaseTable) {
        this.phaseTable = phaseTable;
    }

    public int getMaxPhaseGroups() {
        return maxPhaseGroups;
    }

    public void setMaxPhaseGroups(int maxPhaseGroups) {
        this.maxPhaseGroups = maxPhaseGroups;
    }

    public int getPhaseStatusGroupTable() {
        return phaseStatusGroupTable;
    }

    public void setPhaseStatusGroupTable(int phaseStatusGroupTable) {
        this.phaseStatusGroupTable = phaseStatusGroupTable;
    }

    public int getPhaseControlGroupTable() {
        return phaseControlGroupTable;
    }

    public void setPhaseControlGroupTable(int phaseControlGroupTable) {
        this.phaseControlGroupTable = phaseControlGroupTable;
    }
}
