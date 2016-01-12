package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


import java.util.List;
@Table(name = "GbtOverlap")
public class GbtOverlap {
    private int id;

	private int deviceId;

	private int overlapId;

	private int overlapType;

	private int includePhaseCount;

	private String includePhase;

	private int amendPhaseCount;

	private String amendPhase;

    private int tailGreen;

    private int tailYellow;

    private int tailRed;

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

    public int getOverlapId() {
        return overlapId;
    }

    public void setOverlapId(int overlapId) {
        this.overlapId = overlapId;
    }

    public int getOverlapType() {
        return overlapType;
    }

    public void setOverlapType(int overlapType) {
        this.overlapType = overlapType;
    }

    public int getIncludePhaseCount() {
        return includePhaseCount;
    }

    public void setIncludePhaseCount(int includePhaseCount) {
        this.includePhaseCount = includePhaseCount;
    }

    public String getIncludePhase() {
        return includePhase;
    }

    public void setIncludePhase(String includePhase) {
        this.includePhase = includePhase;
    }

    public int getAmendPhaseCount() {
        return amendPhaseCount;
    }

    public void setAmendPhaseCount(int amendPhaseCount) {
        this.amendPhaseCount = amendPhaseCount;
    }

    public String getAmendPhase() {
        return amendPhase;
    }

    public void setAmendPhase(String amendPhase) {
        this.amendPhase = amendPhase;
    }

    public int getTailGreen() {
        return tailGreen;
    }

    public void setTailGreen(int tailGreen) {
        this.tailGreen = tailGreen;
    }

    public int getTailYellow() {
        return tailYellow;
    }

    public void setTailYellow(int tailYellow) {
        this.tailYellow = tailYellow;
    }

    public int getTailRed() {
        return tailRed;
    }

    public void setTailRed(int tailRed) {
        this.tailRed = tailRed;
    }
}
