package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPort1Table")
public class NtcipPort1Table {

    private int id;

    private int deviceId;

    private int port1Number;

    private int port1DevicePresent;

    private int port1Frame40Enable;

    private int port1Status;

    private int port1FaultFrame;

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

    public int getPort1Number() {
        return port1Number;
    }

    public void setPort1Number(int port1Number) {
        this.port1Number = port1Number;
    }

    public int getPort1DevicePresent() {
        return port1DevicePresent;
    }

    public void setPort1DevicePresent(int port1DevicePresent) {
        this.port1DevicePresent = port1DevicePresent;
    }

    public int getPort1Frame40Enable() {
        return port1Frame40Enable;
    }

    public void setPort1Frame40Enable(int port1Frame40Enable) {
        this.port1Frame40Enable = port1Frame40Enable;
    }

    public int getPort1Status() {
        return port1Status;
    }

    public void setPort1Status(int port1Status) {
        this.port1Status = port1Status;
    }

    public int getPort1FaultFrame() {
        return port1FaultFrame;
    }

    public void setPort1FaultFrame(int port1FaultFrame) {
        this.port1FaultFrame = port1FaultFrame;
    }
}
