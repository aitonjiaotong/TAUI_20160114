package cn.com.aiton.domain;

/**
 * Created by Administrator on 2015/6/23.
 */
public class GbtControlModel {
    private String name;
    private int value;

    public GbtControlModel(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
