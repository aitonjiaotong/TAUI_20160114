package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipProfilesPMPP")
public class NtcipProfilesPMPP {

    private int id;

    private int deviceId;

    private int maxGroupAddresses;

    private int hdlcGroupAddressTable;

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

    public int getMaxGroupAddresses() {
        return maxGroupAddresses;
    }

    public void setMaxGroupAddresses(int maxGroupAddresses) {
        this.maxGroupAddresses = maxGroupAddresses;
    }

    public int getHdlcGroupAddressTable() {
        return hdlcGroupAddressTable;
    }

    public void setHdlcGroupAddressTable(int hdlcGroupAddressTable) {
        this.hdlcGroupAddressTable = hdlcGroupAddressTable;
    }
}
