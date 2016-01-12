package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


/**
 * Created by Administrator on 14-3-14.
 */
@Table(name="FaultMaintainMan")
public class FaultMaintainMan {
    private int id;

    private String name;

    private String phone;

    private String tel;

    private int type;//维护设备类型，信号机型号，电子警察等

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
