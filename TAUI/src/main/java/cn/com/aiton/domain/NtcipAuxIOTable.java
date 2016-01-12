package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipAuxIOTable")
public class NtcipAuxIOTable {

    private int id;

    private int deviceId;

    private int portType;

    private int portNumber;

    private String description;

    private int resolution;

    private int value;

    private int portDirection;

    private int lastCommandedState;

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

    public int getPortType() {
        return portType;
    }

    public void setPortType(int portType) {
        this.portType = portType;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPortDirection() {
        return portDirection;
    }

    public void setPortDirection(int portDirection) {
        this.portDirection = portDirection;
    }

    public int getLastCommandedState() {
        return lastCommandedState;
    }

    public void setLastCommandedState(int lastCommandedState) {
        this.lastCommandedState = lastCommandedState;
    }
}
