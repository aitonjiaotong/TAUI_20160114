package cn.com.aiton.domain;

/**
 * Created by Administrator on 14-2-14.
 */
public class Message {
    private String obj;
    private String msg;
    private boolean boo;

    public Message() {
    }

    public Message(String obj, String msg, boolean boo) {
        this.obj = obj;
        this.msg = msg;
        this.boo = boo;
    }

    @Override
    public String toString() {
        return "Message{" +
                "obj='" + obj + '\'' +
                ", msg='" + msg + '\'' +
                ", boo=" + boo +
                '}';
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }
}
