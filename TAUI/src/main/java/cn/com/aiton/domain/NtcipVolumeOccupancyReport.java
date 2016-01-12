package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipVolumeOccupancyReport")
public class NtcipVolumeOccupancyReport {

    private int id;

    private int deviceId;

    private int volumeOccupancySequence;

    private int volumeOccupancyPeriod;

    private int activeVolumeOccupancyDetectors;


    private int volumeOccupancyTable;

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

    public int getVolumeOccupancySequence() {
        return volumeOccupancySequence;
    }

    public void setVolumeOccupancySequence(int volumeOccupancySequence) {
        this.volumeOccupancySequence = volumeOccupancySequence;
    }

    public int getVolumeOccupancyPeriod() {
        return volumeOccupancyPeriod;
    }

    public void setVolumeOccupancyPeriod(int volumeOccupancyPeriod) {
        this.volumeOccupancyPeriod = volumeOccupancyPeriod;
    }

    public int getActiveVolumeOccupancyDetectors() {
        return activeVolumeOccupancyDetectors;
    }

    public void setActiveVolumeOccupancyDetectors(int activeVolumeOccupancyDetectors) {
        this.activeVolumeOccupancyDetectors = activeVolumeOccupancyDetectors;
    }

    public int getVolumeOccupancyTable() {
        return volumeOccupancyTable;
    }

    public void setVolumeOccupancyTable(int volumeOccupancyTable) {
        this.volumeOccupancyTable = volumeOccupancyTable;
    }
}
