package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipOverlap")
public class NtcipOverlap {

    private int id;

    private int deviceId;

    private int maxOverlaps;

    private int overlapTable;

    private int maxOverlapStatusGroups;

    private int overlapStatusGroupTable;

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

    public int getMaxOverlaps() {
        return maxOverlaps;
    }

    public void setMaxOverlaps(int maxOverlaps) {
        this.maxOverlaps = maxOverlaps;
    }

    public int getOverlapTable() {
        return overlapTable;
    }

    public void setOverlapTable(int overlapTable) {
        this.overlapTable = overlapTable;
    }

    public int getMaxOverlapStatusGroups() {
        return maxOverlapStatusGroups;
    }

    public void setMaxOverlapStatusGroups(int maxOverlapStatusGroups) {
        this.maxOverlapStatusGroups = maxOverlapStatusGroups;
    }

    public int getOverlapStatusGroupTable() {
        return overlapStatusGroupTable;
    }

    public void setOverlapStatusGroupTable(int overlapStatusGroupTable) {
        this.overlapStatusGroupTable = overlapStatusGroupTable;
    }
}
