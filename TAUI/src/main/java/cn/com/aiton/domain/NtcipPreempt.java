package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipPreempt")
public class NtcipPreempt {

    private int id;

    private int deviceId;

    private int maxPreempts;

    private long preemptTable;

    private long preemptControlTable;

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

    public int getMaxPreempts() {
        return maxPreempts;
    }

    public void setMaxPreempts(int maxPreempts) {
        this.maxPreempts = maxPreempts;
    }

    public long getPreemptTable() {
        return preemptTable;
    }

    public void setPreemptTable(long preemptTable) {
        this.preemptTable = preemptTable;
    }

    public long getPreemptControlTable() {
        return preemptControlTable;
    }

    public void setPreemptControlTable(long preemptControlTable) {
        this.preemptControlTable = preemptControlTable;
    }
}
