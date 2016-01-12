package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipConfiguration")
public class NtcipConfiguration {

    private int id;

    private int deviceId;

    private int maxModule;

    private int moduleId;

    private String baseStandards;

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

    public int getMaxModule() {
        return maxModule;
    }

    public void setMaxModule(int maxModule) {
        this.maxModule = maxModule;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getBaseStandards() {
        return baseStandards;
    }

    public void setBaseStandards(String baseStandards) {
        this.baseStandards = baseStandards;
    }
}
