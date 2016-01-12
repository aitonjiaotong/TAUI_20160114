package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipVehicleDetectorStatusGroupTable")
public class NtcipVehicleDetectorStatusGroupTable {

    private int id;

    private int deviceId;

    private int vehicleDetectorStatusGroupNumber;

    private int vehicleDetectorStatusGroupActive;


    private int vehicleDetectorStatusGroupAlarms;

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

    public int getVehicleDetectorStatusGroupNumber() {
        return vehicleDetectorStatusGroupNumber;
    }

    public void setVehicleDetectorStatusGroupNumber(int vehicleDetectorStatusGroupNumber) {
        this.vehicleDetectorStatusGroupNumber = vehicleDetectorStatusGroupNumber;
    }

    public int getVehicleDetectorStatusGroupActive() {
        return vehicleDetectorStatusGroupActive;
    }

    public void setVehicleDetectorStatusGroupActive(int vehicleDetectorStatusGroupActive) {
        this.vehicleDetectorStatusGroupActive = vehicleDetectorStatusGroupActive;
    }

    public int getVehicleDetectorStatusGroupAlarms() {
        return vehicleDetectorStatusGroupAlarms;
    }

    public void setVehicleDetectorStatusGroupAlarms(int vehicleDetectorStatusGroupAlarms) {
        this.vehicleDetectorStatusGroupAlarms = vehicleDetectorStatusGroupAlarms;
    }
}
