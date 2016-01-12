package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

import java.util.Date;
@Table(name = "GbtTrafficStatistics")
public class GbtTrafficStatistics {

    private int id;

	private int deviceId;

	private int detectorId;

    private Date recordTime;

    private long sumVolume;

    private int  avgOccupancy;

    private int maxOccupancy;

    private int minOccupancy;

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

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public long getSumVolume() {
        return sumVolume;
    }

    public void setSumVolume(long sumVolume) {
        this.sumVolume = sumVolume;
    }

    public int getAvgOccupancy() {
        return avgOccupancy;
    }

    public void setAvgOccupancy(int avgOccupancy) {
        this.avgOccupancy = avgOccupancy;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getMinOccupancy() {
        return minOccupancy;
    }

    public void setMinOccupancy(int minOccupancy) {
        this.minOccupancy = minOccupancy;
    }
}
