package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipOverlapTable")
public class NtcipOverlapTable {

    private int id;

    private int deviceId;

    private int overlapNumber;

    private int overlapType;

    private String overlapIncludedPhases;

    private String overlapModifierPhases;

    private int overlapTrailGreen;

    private int overlapTrailYellow;

    private int overlapTrailRed;

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

    public int getOverlapNumber() {
        return overlapNumber;
    }

    public void setOverlapNumber(int overlapNumber) {
        this.overlapNumber = overlapNumber;
    }

    public int getOverlapType() {
        return overlapType;
    }

    public void setOverlapType(int overlapType) {
        this.overlapType = overlapType;
    }

    public String getOverlapIncludedPhases() {
        return overlapIncludedPhases;
    }

    public void setOverlapIncludedPhases(String overlapIncludedPhases) {
        this.overlapIncludedPhases = overlapIncludedPhases;
    }

    public String getOverlapModifierPhases() {
        return overlapModifierPhases;
    }

    public void setOverlapModifierPhases(String overlapModifierPhases) {
        this.overlapModifierPhases = overlapModifierPhases;
    }

    public int getOverlapTrailGreen() {
        return overlapTrailGreen;
    }

    public void setOverlapTrailGreen(int overlapTrailGreen) {
        this.overlapTrailGreen = overlapTrailGreen;
    }

    public int getOverlapTrailYellow() {
        return overlapTrailYellow;
    }

    public void setOverlapTrailYellow(int overlapTrailYellow) {
        this.overlapTrailYellow = overlapTrailYellow;
    }

    public int getOverlapTrailRed() {
        return overlapTrailRed;
    }

    public void setOverlapTrailRed(int overlapTrailRed) {
        this.overlapTrailRed = overlapTrailRed;
    }
}
