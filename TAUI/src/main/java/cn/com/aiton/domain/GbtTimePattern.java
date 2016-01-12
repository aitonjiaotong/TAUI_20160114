package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtTimePattern")
public class GbtTimePattern {

    private int id;

	private int deviceId;

	private int timePatternId;

	private int cycleTime;

	private int offset;

	private int coordinatePhase;

	private int stagePatternId;

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

    public int getTimePatternId() {
        return timePatternId;
    }

    public void setTimePatternId(int timePatternId) {
        this.timePatternId = timePatternId;
    }

    public int getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(int cycleTime) {
        this.cycleTime = cycleTime;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCoordinatePhase() {
        return coordinatePhase;
    }

    public void setCoordinatePhase(int coordinatePhase) {
        this.coordinatePhase = coordinatePhase;
    }

    public int getStagePatternId() {
        return stagePatternId;
    }

    public void setStagePatternId(int stagePatternId) {
        this.stagePatternId = stagePatternId;
    }
}
