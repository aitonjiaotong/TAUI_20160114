package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipSpecialFunctionOutputTable")
public class NtcipSpecialFunctionOutputTable {

    private int id;

    private int deviceId;

    private int specialFunctionOutputNumber;



    private int specialFunctionOutputState;

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

    public int getSpecialFunctionOutputNumber() {
        return specialFunctionOutputNumber;
    }

    public void setSpecialFunctionOutputNumber(int specialFunctionOutputNumber) {
        this.specialFunctionOutputNumber = specialFunctionOutputNumber;
    }

    public int getSpecialFunctionOutputState() {
        return specialFunctionOutputState;
    }

    public void setSpecialFunctionOutputState(int specialFunctionOutputState) {
        this.specialFunctionOutputState = specialFunctionOutputState;
    }
}
