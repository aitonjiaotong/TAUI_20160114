package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

/**
 * Created by Administrator on 14-3-14.
 */
@Table(name="FaultMessage")
public class FaultSolution {
    private int id;

    private String content;

    private String remark;

    private int faultType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getFaultType() {
        return faultType;
    }

    public void setFaultType(int faultType) {
        this.faultType = faultType;
    }
}
