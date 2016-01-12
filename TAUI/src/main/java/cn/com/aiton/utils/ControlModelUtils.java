package cn.com.aiton.utils;

/**
 * Created by Administrator on 14-2-15.
 */
public class ControlModelUtils {
    public static String controlModelToString(byte b)
    {
        String result = "";
        switch (b)
        {
            case 0x01:
                result = result + "多时段";
                break;
            case 0x02:
                result = result + "系统优化，即联网";
                break;
            case 0x03:
                result = result + "无电线缆协调";
                break;
            case 0x04:
                result = result + "有线电缆协调";
                break;
            case 0x05:
                result = result + "主从线控";
                break;
            case 0x06:
                result = result + "手动控制";
                break;
            case 0x07:
                result = result + "单点全感应";
                break;
            case 0x08:
                result = result + "单点主线优先半感应";
                break;
            case 0x09:
                result = result + "单点次线优先半感应";
                break;
            case 0x0a:
                result = result + "自适应";
                break;
            case 0x0b:
                result = result + "面板控制";
                break;
            default:
                result = result + "未知";
                break;
        }
        return result;
    }
}
