package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "GbtGroupTimeBase")
public class GbtGroupTimeBase {

    private int id;

	private int groupId;

	private int timeBaseId;

	private int month;

	private int week;

	private long day;

	private int scheduleId;

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

    public int getTimeBaseId() {
        return timeBaseId;
    }

    public void setTimeBaseId(int timeBaseId) {
        this.timeBaseId = timeBaseId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }
}
