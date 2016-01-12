package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtDetector")
public class GbtDetector {

    private int id;

	private int deviceId;

	private int detectorId;

	private int phaseId;

	private int detectorType;

	private int direc;

	private int requestEffectTime;

	private int detectorOption;

	private short saturationVolume;

	private int saturationOccupancy;

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

    public int getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(int detectorId) {
        this.detectorId = detectorId;
    }

    public int getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public int getDetectorType() {
        return detectorType;
    }

    public void setDetectorType(int detectorType) {
        this.detectorType = detectorType;
    }

    public int getDirec() {
        return direc;
    }

    public void setDirec(int direc) {
        this.direc = direc;
    }

    public int getRequestEffectTime() {
        return requestEffectTime;
    }

    public void setRequestEffectTime(int requestEffectTime) {
        this.requestEffectTime = requestEffectTime;
    }

    public int getDetectorOption() {
        return detectorOption;
    }

    public void setDetectorOption(int detectorOption) {
        this.detectorOption = detectorOption;
    }

    public short getSaturationVolume() {
        return saturationVolume;
    }

    public void setSaturationVolume(short saturationVolume) {
        this.saturationVolume = saturationVolume;
    }

    public int getSaturationOccupancy() {
        return saturationOccupancy;
    }

    public void setSaturationOccupancy(int saturationOccupancy) {
        this.saturationOccupancy = saturationOccupancy;
    }
}
