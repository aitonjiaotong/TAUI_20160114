package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipDetector")
public class NtcipDetector {

    private int id;

    private int deviceId;

    private int maxVehicleDetectors;

    private int vehicleDetectorTable;

    private int maxVehicleDetectorStatusGroups;

    private int vehicleDetectorStatusGroupTable;

    private int volumeOccupancyReport;

    private int maxPedestrianDetectors;

    private int pedestrianDetectorTable;

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

    public int getMaxVehicleDetectors() {
        return maxVehicleDetectors;
    }

    public void setMaxVehicleDetectors(int maxVehicleDetectors) {
        this.maxVehicleDetectors = maxVehicleDetectors;
    }

    public int getVehicleDetectorTable() {
        return vehicleDetectorTable;
    }

    public void setVehicleDetectorTable(int vehicleDetectorTable) {
        this.vehicleDetectorTable = vehicleDetectorTable;
    }

    public int getMaxVehicleDetectorStatusGroups() {
        return maxVehicleDetectorStatusGroups;
    }

    public void setMaxVehicleDetectorStatusGroups(int maxVehicleDetectorStatusGroups) {
        this.maxVehicleDetectorStatusGroups = maxVehicleDetectorStatusGroups;
    }

    public int getVehicleDetectorStatusGroupTable() {
        return vehicleDetectorStatusGroupTable;
    }

    public void setVehicleDetectorStatusGroupTable(int vehicleDetectorStatusGroupTable) {
        this.vehicleDetectorStatusGroupTable = vehicleDetectorStatusGroupTable;
    }

    public int getVolumeOccupancyReport() {
        return volumeOccupancyReport;
    }

    public void setVolumeOccupancyReport(int volumeOccupancyReport) {
        this.volumeOccupancyReport = volumeOccupancyReport;
    }

    public int getMaxPedestrianDetectors() {
        return maxPedestrianDetectors;
    }

    public void setMaxPedestrianDetectors(int maxPedestrianDetectors) {
        this.maxPedestrianDetectors = maxPedestrianDetectors;
    }

    public int getPedestrianDetectorTable() {
        return pedestrianDetectorTable;
    }

    public void setPedestrianDetectorTable(int pedestrianDetectorTable) {
        this.pedestrianDetectorTable = pedestrianDetectorTable;
    }
}
