package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipChannel")
public class NtcipChannel {

    private int id;

    private int deviceId;

    private int maxChannels;

    private int channelTable;

    private int maxChannelStatusGroups;

    private int channelStatusGroupTable;

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

    public int getMaxChannels() {
        return maxChannels;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public int getChannelTable() {
        return channelTable;
    }

    public void setChannelTable(int channelTable) {
        this.channelTable = channelTable;
    }

    public int getMaxChannelStatusGroups() {
        return maxChannelStatusGroups;
    }

    public void setMaxChannelStatusGroups(int maxChannelStatusGroups) {
        this.maxChannelStatusGroups = maxChannelStatusGroups;
    }

    public int getChannelStatusGroupTable() {
        return channelStatusGroupTable;
    }

    public void setChannelStatusGroupTable(int channelStatusGroupTable) {
        this.channelStatusGroupTable = channelStatusGroupTable;
    }
}
