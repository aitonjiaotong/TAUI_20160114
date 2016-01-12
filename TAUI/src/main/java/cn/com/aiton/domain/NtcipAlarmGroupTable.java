package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


/**
 * Created by Administrator on 14-11-15.
 */
@Table(name = "NtcipAlarmGroupTable")
public class NtcipAlarmGroupTable {

    private int id;

    private int deviceId;

    private int alarmGroupNumber;

    private int alarmGroupState;

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

    public int getAlarmGroupNumber() {
        return alarmGroupNumber;
    }

    public void setAlarmGroupNumber(int alarmGroupNumber) {
        this.alarmGroupNumber = alarmGroupNumber;
    }

    public int getAlarmGroupState() {
        return alarmGroupState;
    }

    public void setAlarmGroupState(int alarmGroupState) {
        this.alarmGroupState = alarmGroupState;
    }
}
