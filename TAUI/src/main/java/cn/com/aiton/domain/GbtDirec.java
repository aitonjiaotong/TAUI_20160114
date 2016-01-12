package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtDirec")
public class GbtDirec {

    private int id;

	private int deviceId;

	private int direcId;

	private int phaseId;

	private int overlapId;

	private int roadCount;

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

    public int getDirecId() {
        return direcId;
    }

    public void setDirecId(int direcId) {
        this.direcId = direcId;
    }

    public int getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public int getOverlapId() {
        return overlapId;
    }

    public void setOverlapId(int overlapId) {
        this.overlapId = overlapId;
    }

    public int getRoadCount() {
        return roadCount;
    }

    public void setRoadCount(int roadCount) {
        this.roadCount = roadCount;
    }
}
