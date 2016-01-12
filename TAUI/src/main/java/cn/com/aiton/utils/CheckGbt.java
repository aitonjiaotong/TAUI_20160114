package cn.com.aiton.utils;

import cn.com.aiton.domain.Message;

/**
 * Created by Administrator on 14-2-14.
 */
public class CheckGbt {
    public static Message check(byte[] bytes)
    {
        Message m = new Message();
        if (bytes[0] == 0x86)
        {
            if (bytes[1] == 0x05)
            {
              //  MessageBox.Show(fun+":国标通信协议错误类型中的其它错误原因！");
                m.setBoo(false);
                m.setMsg("国标通信协议错误类型中的其它错误原因");
                m.setObj(""+0x05);
                return m;
            }
            else if (bytes[1] == 0x01)
            {
               // MessageBox.Show(fun + ":国标通信协议错误类型中的消息长度太长！");
                m.setBoo(false);
                m.setMsg("国标通信协议错误类型中的消息长度太长");
                m.setObj(""+0x01);
                return m;
            }
            else if (bytes[1] == 0x02)
            {
               // MessageBox.Show(fun + ":国标通信协议错误类型中的消息类型错误！");
                m.setBoo(false);
                m.setMsg("国标通信协议错误类型中的消息类型错误");
                m.setObj(""+0x02);
                return m;
            }
            else if (bytes[1] == 0x03)
            {
               /// MessageBox.Show(fun + ":国标通信协议错误类型中的消息设置对象值超出规定的范围！");
                m.setBoo(false);
                m.setMsg("国标通信协议错误类型中的消息设置对象值超出规定的范围");
                m.setObj(""+0x03);
                return m;
            }
            else if (bytes[1] == 0x04)
            {
              //  MessageBox.Show(fun + ":国标通信协议错误类型中的消息长度太短！");
                m.setBoo(false);
                m.setMsg("国标通信协议错误类型中的消息长度太短");
                m.setObj(""+0x04);
                return m;
            }
            else
            {
               // MessageBox.Show(fun + ":未知原因！");
                m.setBoo(false);
                m.setMsg("未知原因");
                m.setObj("");
                return m;
            }
        }
        m.setBoo(true);
        m.setMsg("检查数据正常");
        m.setObj("");
        return m;
    }
}
