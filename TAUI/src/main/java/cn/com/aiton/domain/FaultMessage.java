package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

import java.util.Date;

/**
 * Created by Administrator on 14-3-14.
 */
@Table(name="FaultMessage")
public class FaultMessage {

    private int id;

    private int deviceId;

    private int solution;

    private int resolveFlag;

    private String faultNumber;

    private String faultCause;

    private String faultType;

    private Date faultTime;

    private Date impTime;

    private Date returnTime;

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

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    public int getResolveFlag() {
        return resolveFlag;
    }

    public void setResolveFlag(int resolveFlag) {
        this.resolveFlag = resolveFlag;
    }

    public String getFaultNumber() {
        return faultNumber;
    }

    public void setFaultNumber(String faultNumber) {
        this.faultNumber = faultNumber;
    }

    public String getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(String faultCause) {
        this.faultCause = faultCause;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    public Date getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(Date faultTime) {
        this.faultTime = faultTime;
    }

    public Date getImpTime() {
        return impTime;
    }

    public void setImpTime(Date impTime) {
        this.impTime = impTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }
}
