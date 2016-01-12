package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipTs2port1")
public class NtcipTs2port1 {

    private int id;

    private int deviceId;

    private int maxPort1Addresses;

    private int port1Table;

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

    public int getMaxPort1Addresses() {
        return maxPort1Addresses;
    }

    public void setMaxPort1Addresses(int maxPort1Addresses) {
        this.maxPort1Addresses = maxPort1Addresses;
    }

    public int getPort1Table() {
        return port1Table;
    }

    public void setPort1Table(int port1Table) {
        this.port1Table = port1Table;
    }
}
