package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipChannelTable")
public class NtcipChannelTable {

    private int id;

    private int deviceId;

    private int channelNumber;

    private int channelControlSource;

    private int channelControlType;

    private int channelFlash;

    private int channelDim;

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

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getChannelControlSource() {
        return channelControlSource;
    }

    public void setChannelControlSource(int channelControlSource) {
        this.channelControlSource = channelControlSource;
    }

    public int getChannelControlType() {
        return channelControlType;
    }

    public void setChannelControlType(int channelControlType) {
        this.channelControlType = channelControlType;
    }

    public int getChannelFlash() {
        return channelFlash;
    }

    public void setChannelFlash(int channelFlash) {
        this.channelFlash = channelFlash;
    }

    public int getChannelDim() {
        return channelDim;
    }

    public void setChannelDim(int channelDim) {
        this.channelDim = channelDim;
    }
}
