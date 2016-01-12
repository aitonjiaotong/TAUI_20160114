package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipTimebaseAscActionTable")
public class NtcipTimebaseAscActionTable {

    private int id;

    private int deviceId;

    private int timebaseAscActionNumber;

    private int timebaseActionPattern;

    private int timebaseActionAuxillaryFunction;


    private int timebaseActionSpecialFunction;

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

    public int getTimebaseAscActionNumber() {
        return timebaseAscActionNumber;
    }

    public void setTimebaseAscActionNumber(int timebaseAscActionNumber) {
        this.timebaseAscActionNumber = timebaseAscActionNumber;
    }

    public int getTimebaseActionPattern() {
        return timebaseActionPattern;
    }

    public void setTimebaseActionPattern(int timebaseActionPattern) {
        this.timebaseActionPattern = timebaseActionPattern;
    }

    public int getTimebaseActionAuxillaryFunction() {
        return timebaseActionAuxillaryFunction;
    }

    public void setTimebaseActionAuxillaryFunction(int timebaseActionAuxillaryFunction) {
        this.timebaseActionAuxillaryFunction = timebaseActionAuxillaryFunction;
    }

    public int getTimebaseActionSpecialFunction() {
        return timebaseActionSpecialFunction;
    }

    public void setTimebaseActionSpecialFunction(int timebaseActionSpecialFunction) {
        this.timebaseActionSpecialFunction = timebaseActionSpecialFunction;
    }
}
