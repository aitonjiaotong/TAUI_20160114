package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtChannel")
public class GbtChannel {
    private int id;

	private int deviceId;

	private int channelId;

	private int controlSource;

	private int autoFlashControl;

	private int controlType;

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

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getControlSource() {
        return controlSource;
    }

    public void setControlSource(int controlSource) {
        this.controlSource = controlSource;
    }

    public int getAutoFlashControl() {
        return autoFlashControl;
    }

    public void setAutoFlashControl(int autoFlashControl) {
        this.autoFlashControl = autoFlashControl;
    }

    public int getControlType() {
        return controlType;
    }

    public void setControlType(int controlType) {
        this.controlType = controlType;
    }
}
