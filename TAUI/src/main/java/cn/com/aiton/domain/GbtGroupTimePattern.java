package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtGroupTimePattern")
public class GbtGroupTimePattern {

    private int id;

	private int groupId;

	private byte timePatternId;

	private byte cycleTime;

	private String offset;

	private String coordPhase;

	private byte stagePatternId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public byte getTimePatternId() {
        return timePatternId;
    }

    public void setTimePatternId(byte timePatternId) {
        this.timePatternId = timePatternId;
    }

    public byte getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(byte cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getCoordPhase() {
        return coordPhase;
    }

    public void setCoordPhase(String coordPhase) {
        this.coordPhase = coordPhase;
    }

    public byte getStagePatternId() {
        return stagePatternId;
    }

    public void setStagePatternId(byte stagePatternId) {
        this.stagePatternId = stagePatternId;
    }
}
