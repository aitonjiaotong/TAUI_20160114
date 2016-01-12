package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtPhase")
public class GbtPhase {

    private int id;

	private int deviceId;

	private int phaseId;

	private int pedestrainGreen;

	private int pedestrainClear;

	private int minGreen;

	private int greenDelayUnit;

	private int maxGreen1;

	private int maxGreen2;

	private int fixGreen;

	private int greenFlash;

	private int phaseType;

	private int phaseOption;

	private int extend;

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

    public int getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public int getPedestrainGreen() {
        return pedestrainGreen;
    }

    public void setPedestrainGreen(int pedestrainGreen) {
        this.pedestrainGreen = pedestrainGreen;
    }

    public int getPedestrainClear() {
        return pedestrainClear;
    }

    public void setPedestrainClear(int pedestrainClear) {
        this.pedestrainClear = pedestrainClear;
    }

    public int getMinGreen() {
        return minGreen;
    }

    public void setMinGreen(int minGreen) {
        this.minGreen = minGreen;
    }

    public int getGreenDelayUnit() {
        return greenDelayUnit;
    }

    public void setGreenDelayUnit(int greenDelayUnit) {
        this.greenDelayUnit = greenDelayUnit;
    }

    public int getMaxGreen1() {
        return maxGreen1;
    }

    public void setMaxGreen1(int maxGreen1) {
        this.maxGreen1 = maxGreen1;
    }

    public int getMaxGreen2() {
        return maxGreen2;
    }

    public void setMaxGreen2(int maxGreen2) {
        this.maxGreen2 = maxGreen2;
    }

    public int getFixGreen() {
        return fixGreen;
    }

    public void setFixGreen(int fixGreen) {
        this.fixGreen = fixGreen;
    }

    public int getGreenFlash() {
        return greenFlash;
    }

    public void setGreenFlash(int greenFlash) {
        this.greenFlash = greenFlash;
    }

    public int getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(int phaseType) {
        this.phaseType = phaseType;
    }

    public int getPhaseOption() {
        return phaseOption;
    }

    public void setPhaseOption(int phaseOption) {
        this.phaseOption = phaseOption;
    }

    public int getExtend() {
        return extend;
    }

    public void setExtend(int extend) {
        this.extend = extend;
    }
}
