package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipSequenceTable")
public class NtcipSequenceTable {

    private int id;

    private int deviceId;

    private int sequenceNumber;


    private int sequenceRingNumber;

    private String sequenceData;

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

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getSequenceRingNumber() {
        return sequenceRingNumber;
    }

    public void setSequenceRingNumber(int sequenceRingNumber) {
        this.sequenceRingNumber = sequenceRingNumber;
    }

    public String getSequenceData() {
        return sequenceData;
    }

    public void setSequenceData(String sequenceData) {
        this.sequenceData = sequenceData;
    }
}
