package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPreemptControlTable")
public class NtcipPreemptControlTable {

    private int id;

    private int deviceId;

    private int preemptControlNumber;

    private int preemptControlState;

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

    public int getPreemptControlNumber() {
        return preemptControlNumber;
    }

    public void setPreemptControlNumber(int preemptControlNumber) {
        this.preemptControlNumber = preemptControlNumber;
    }

    public int getPreemptControlState() {
        return preemptControlState;
    }

    public void setPreemptControlState(int preemptControlState) {
        this.preemptControlState = preemptControlState;
    }
}
