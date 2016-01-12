package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "GbtLampCheck")
public class GbtLampCheck {

    private int id;

    private int deviceId;

    private int lampId;

    private int lampFlag;

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

    public int getLampId() {
        return lampId;
    }

    public void setLampId(int lampId) {
        this.lampId = lampId;
    }

    public int getLampFlag() {
        return lampFlag;
    }

    public void setLampFlag(int lampFlag) {
        this.lampFlag = lampFlag;
    }
}
