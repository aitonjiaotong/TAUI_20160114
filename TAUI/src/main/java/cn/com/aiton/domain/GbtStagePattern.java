package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtStagePattern")
public class GbtStagePattern {

    private int id;

	private int deviceId;

	private int stagePatternId;

	private int stageId;

	private int allowPhase;

	private int greenTime;

	private int yellowTime;

	private int redTime;

	private int option;

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

    public int getStagePatternId() {
        return stagePatternId;
    }

    public void setStagePatternId(int stagePatternId) {
        this.stagePatternId = stagePatternId;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    public int getAllowPhase() {
        return allowPhase;
    }

    public void setAllowPhase(int allowPhase) {
        this.allowPhase = allowPhase;
    }

    public int getGreenTime() {
        return greenTime;
    }

    public void setGreenTime(int greenTime) {
        this.greenTime = greenTime;
    }

    public int getYellowTime() {
        return yellowTime;
    }

    public void setYellowTime(int yellowTime) {
        this.yellowTime = yellowTime;
    }

    public int getRedTime() {
        return redTime;
    }

    public void setRedTime(int redTime) {
        this.redTime = redTime;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}
