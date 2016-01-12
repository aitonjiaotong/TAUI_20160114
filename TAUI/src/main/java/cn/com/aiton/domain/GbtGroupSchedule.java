package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtGroupSchedule")
public class GbtGroupSchedule {

    private int id;

	private int groupId;

	private int scheduleId;

	private int eventId;

	private int beginHour;

	private int beginMinute;

	private int timePatternId;

	private int controlMode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
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

    public int getTimePatternId() {
        return timePatternId;
    }

    public void setTimePatternId(int timePatternId) {
        this.timePatternId = timePatternId;
    }

    public int getControlMode() {
        return controlMode;
    }

    public void setControlMode(int controlMode) {
        this.controlMode = controlMode;
    }
}
