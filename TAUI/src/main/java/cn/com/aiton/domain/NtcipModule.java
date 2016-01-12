package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipModule")
public class NtcipModule {

    private int id;

    private int deviceId;

    private int moduleNumber;

    private int moduleDeviceNode;

    private String moduleMake;

    private String  moduleModel;

    private String moduleVersion;

    private int moduleType;

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

    public int getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(int moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public int getModuleDeviceNode() {
        return moduleDeviceNode;
    }

    public void setModuleDeviceNode(int moduleDeviceNode) {
        this.moduleDeviceNode = moduleDeviceNode;
    }

    public String getModuleMake() {
        return moduleMake;
    }

    public void setModuleMake(String moduleMake) {
        this.moduleMake = moduleMake;
    }

    public String getModuleModel() {
        return moduleModel;
    }

    public void setModuleModel(String moduleModel) {
        this.moduleModel = moduleModel;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public int getModuleType() {
        return moduleType;
    }

    public void setModuleType(int moduleType) {
        this.moduleType = moduleType;
    }
}
