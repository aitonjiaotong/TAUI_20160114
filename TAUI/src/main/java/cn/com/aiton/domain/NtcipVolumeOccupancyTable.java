package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipVolumeOccupancyTable")
public class NtcipVolumeOccupancyTable {

    private int id;

    private int deviceId;

    private int detectorVolume;

    private int detectorOccupancy;

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

    public int getDetectorVolume() {
        return detectorVolume;
    }

    public void setDetectorVolume(int detectorVolume) {
        this.detectorVolume = detectorVolume;
    }

    public int getDetectorOccupancy() {
        return detectorOccupancy;
    }

    public void setDetectorOccupancy(int detectorOccupancy) {
        this.detectorOccupancy = detectorOccupancy;
    }
}
