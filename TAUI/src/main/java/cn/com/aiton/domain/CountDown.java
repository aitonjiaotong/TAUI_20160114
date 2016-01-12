package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.*;
/**
 * Created by Administrator on 14-2-16.
 */
@Table(name="CountDown")
public class CountDown {
    private int id;

    private int deviceId;

    private int countDownId;

    private int phase;

    private int overlapPhase;

    private int mode;

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

    public int getCountDownId() {
        return countDownId;
    }

    public void setCountDownId(int countDownId) {
        this.countDownId = countDownId;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getOverlapPhase() {
        return overlapPhase;
    }

    public void setOverlapPhase(int overlapPhase) {
        this.overlapPhase = overlapPhase;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
}
