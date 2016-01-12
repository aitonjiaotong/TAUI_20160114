package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;
import java.util.Date;
import java.util.List;



@Table(name = "vip")
public class Vip {

    private int id;

	private int validity;

	private int direc;

	private int control;

	private Date startTime;

	private Date endTime;

	private String listNode;

	private String listStagePattern;

	private String timeDiff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getDirec() {
        return direc;
    }

    public void setDirec(int direc) {
        this.direc = direc;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getListNode() {
        return listNode;
    }

    public void setListNode(String listNode) {
        this.listNode = listNode;
    }

    public String getListStagePattern() {
        return listStagePattern;
    }

    public void setListStagePattern(String listStagePattern) {
        this.listStagePattern = listStagePattern;
    }

    public String getTimeDiff() {
        return timeDiff;
    }

    public void setTimeDiff(String timeDiff) {
        this.timeDiff = timeDiff;
    }
}
