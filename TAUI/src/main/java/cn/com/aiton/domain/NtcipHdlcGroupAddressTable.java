package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipHdlcGroupAddressTable")
public class NtcipHdlcGroupAddressTable {

    private int id;

    private int deviceId;

    private  int hdlcGroupAddressIndex;

    private  int hdlcGroupAddressNumber;

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

    public int getHdlcGroupAddressIndex() {
        return hdlcGroupAddressIndex;
    }

    public void setHdlcGroupAddressIndex(int hdlcGroupAddressIndex) {
        this.hdlcGroupAddressIndex = hdlcGroupAddressIndex;
    }

    public int getHdlcGroupAddressNumber() {
        return hdlcGroupAddressNumber;
    }

    public void setHdlcGroupAddressNumber(int hdlcGroupAddressNumber) {
        this.hdlcGroupAddressNumber = hdlcGroupAddressNumber;
    }
}
