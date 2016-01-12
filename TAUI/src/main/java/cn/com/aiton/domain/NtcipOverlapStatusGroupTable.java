package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipOverlapStatusGroupTable")
public class NtcipOverlapStatusGroupTable {

    private int id;

    private int deviceId;

    private int overlapStatusGroupNumber;

    private int overlapStatusGroupReds;

    private int overlapStatusGroupYellows;

    private int overlapStatusGroupGreens;

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

    public int getOverlapStatusGroupNumber() {
        return overlapStatusGroupNumber;
    }

    public void setOverlapStatusGroupNumber(int overlapStatusGroupNumber) {
        this.overlapStatusGroupNumber = overlapStatusGroupNumber;
    }

    public int getOverlapStatusGroupReds() {
        return overlapStatusGroupReds;
    }

    public void setOverlapStatusGroupReds(int overlapStatusGroupReds) {
        this.overlapStatusGroupReds = overlapStatusGroupReds;
    }

    public int getOverlapStatusGroupYellows() {
        return overlapStatusGroupYellows;
    }

    public void setOverlapStatusGroupYellows(int overlapStatusGroupYellows) {
        this.overlapStatusGroupYellows = overlapStatusGroupYellows;
    }

    public int getOverlapStatusGroupGreens() {
        return overlapStatusGroupGreens;
    }

    public void setOverlapStatusGroupGreens(int overlapStatusGroupGreens) {
        this.overlapStatusGroupGreens = overlapStatusGroupGreens;
    }
}
