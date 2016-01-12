package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtSchedule")
public class GbtSchedule {

    private int id;

	private int deviceId;

	private int scheduleId;

	private int eventId;

	private int beginHour;

	private int beginMinute;

	private int controlMode;

	private int timePatternId;

	private int auxOut;

	private int specialOut;

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

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(int beginHour) {
        this.beginHour = beginHour;
    }

    public int getBeginMinute() {
        return beginMinute;
    }

    public void setBeginMinute(int beginMinute) {
        this.beginMinute = beginMinute;
    }

    public int getControlMode() {
        return controlMode;
    }

    public void setControlMode(int controlMode) {
        this.controlMode = controlMode;
    }

    public int getTimePatternId() {
        return timePatternId;
    }

    public void setTimePatternId(int timePatternId) {
        this.timePatternId = timePatternId;
    }

    public int getAuxOut() {
        return auxOut;
    }

    public void setAuxOut(int auxOut) {
        this.auxOut = auxOut;
    }

    public int getSpecialOut() {
        return specialOut;
    }

    public void setSpecialOut(int specialOut) {
        this.specialOut = specialOut;
    }
}
