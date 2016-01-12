package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPatternTable")
public class NtcipPatternTable {

    private int id;

    private int deviceId;

    private int patternNumber;

    private int patternCycleTime;

    private int patternOffsetTime;

    private int patternSplitNumber;

    private int patternSequenceNumber;

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

    public int getPatternNumber() {
        return patternNumber;
    }

    public void setPatternNumber(int patternNumber) {
        this.patternNumber = patternNumber;
    }

    public int getPatternCycleTime() {
        return patternCycleTime;
    }

    public void setPatternCycleTime(int patternCycleTime) {
        this.patternCycleTime = patternCycleTime;
    }

    public int getPatternOffsetTime() {
        return patternOffsetTime;
    }

    public void setPatternOffsetTime(int patternOffsetTime) {
        this.patternOffsetTime = patternOffsetTime;
    }

    public int getPatternSplitNumber() {
        return patternSplitNumber;
    }

    public void setPatternSplitNumber(int patternSplitNumber) {
        this.patternSplitNumber = patternSplitNumber;
    }

    public int getPatternSequenceNumber() {
        return patternSequenceNumber;
    }

    public void setPatternSequenceNumber(int patternSequenceNumber) {
        this.patternSequenceNumber = patternSequenceNumber;
    }
}
