package cn.com.aiton.domain;

/**
 * Created by Administrator on 2015/7/18.
 */
public class TimePatterDesc{
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public TimePatterDesc() {
    }

    public TimePatterDesc(String name, int value) {
        this.name = name;
        this.value = value;
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