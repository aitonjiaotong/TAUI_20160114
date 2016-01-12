package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipRing")
public class NtcipRing {

    private int id;

    private int deviceId;

    private int maxRings;

    private int maxSequences;

    private int sequenceTable;

    private int maxRingControlGroups;

    private int ringControlGroupTable;

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

    public int getMaxRings() {
        return maxRings;
    }

    public void setMaxRings(int maxRings) {
        this.maxRings = maxRings;
    }

    public int getMaxSequences() {
        return maxSequences;
    }

    public void setMaxSequences(int maxSequences) {
        this.maxSequences = maxSequences;
    }

    public int getSequenceTable() {
        return sequenceTable;
    }

    public void setSequenceTable(int sequenceTable) {
        this.sequenceTable = sequenceTable;
    }

    public int getMaxRingControlGroups() {
        return maxRingControlGroups;
    }

    public void setMaxRingControlGroups(int maxRingControlGroups) {
        this.maxRingControlGroups = maxRingControlGroups;
    }

    public int getRingControlGroupTable() {
        return ringControlGroupTable;
    }

    public void setRingControlGroupTable(int ringControlGroupTable) {
        this.ringControlGroupTable = ringControlGroupTable;
    }
}
