package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipChannelStatusGroupTable")
public class NtcipChannelStatusGroupTable {

    private int id;

    private int deviceId;

    private int channelStatusGroupNumber;

    private int channelStatusGroupReds;

    private int channelStatusGroupYellows;

    private int channelStatusGroupGreens;

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

    public int getChannelStatusGroupNumber() {
        return channelStatusGroupNumber;
    }

    public void setChannelStatusGroupNumber(int channelStatusGroupNumber) {
        this.channelStatusGroupNumber = channelStatusGroupNumber;
    }

    public int getChannelStatusGroupReds() {
        return channelStatusGroupReds;
    }

    public void setChannelStatusGroupReds(int channelStatusGroupReds) {
        this.channelStatusGroupReds = channelStatusGroupReds;
    }

    public int getChannelStatusGroupYellows() {
        return channelStatusGroupYellows;
    }

    public void setChannelStatusGroupYellows(int channelStatusGroupYellows) {
        this.channelStatusGroupYellows = channelStatusGroupYellows;
    }

    public int getChannelStatusGroupGreens() {
        return channelStatusGroupGreens;
    }

    public void setChannelStatusGroupGreens(int channelStatusGroupGreens) {
        this.channelStatusGroupGreens = channelStatusGroupGreens;
    }
}
