package cn.com.aiton.utils;

/**
 * Created by Administrator on 14-2-14.
 */
public class EventLogUtils {
    public static String eventTypeToString(int type){
        String result = "未知";
        switch (type)
        {
            case 0:
                result = "信号灯";
                break;
            case 1:
                result = "绿冲突";
                break;
            case 2:
                result = "检测器";
                break;
            case 3:
                result = "电压";
                break;
            case 4:
                result = "温度";
                break;
            case 5:
                result = "黄闪器";
                break;
            case 15:
                result = "其他类型日志";
                break;
            case 6:
                result = "灯控板";
                break;
            case 7:
                result = "检测器板";
                break;
            case 8:
                result = "黄闪器板";
                break;
            case 9:
                result = "程序重启";
                break;
            case 10:
                result = "系统时间修改";
                break;
            case 11:
                result = "门报警";
                break;
            case 12:
                result = "机器手动";
                break;
            case 13:
                result = "灯色输出异常";
                break;
            case 14:
                result = "灯色输出异常2";
                break;
            case 16:
                result = "can总线";
                break;
            default:
                break;
        }

        return result;
    }
    public static String eventDescToString(long i, byte type){
        String result = "";
        if (type == 0x00)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            byte b1 = bpara[0];
            result = result + "信号灯，第【" + b1 + "】号灯，内容：";
            switch (bpara[1])
            {
                case 0x00:
                    result = result + "【正常】";
                    break;
                case 0x01:
                    result = result + "【长亮】";
                    break;
                case 0x02:
                    result = result + "【长灭】";
                    break;
                case 0x03:
                    result = result + "【可控硅击穿】";
                    break;
                default:
                    result = result + "【未知】";
                    break;
            }
            result = result + "，第【" + bpara[3] + "】灯控板。";
        }
        else if (type == 0x01)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "绿冲突，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "红绿软冲突";
                    break;
                case 0x02:
                    result = result + "红绿硬冲突";
                    break;
                case 0x03:
                    result = result + "相位绿冲突";
                    break;
                default:
                    break;
            }
            result = result + ",冲突灯控板号【" + bpara[1] + "】,冲突灯组号【" + bpara[2] + "】";
        }
        else if (type == 0x02)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "检测器，第【" + bpara[0] + "】号";
            switch (bpara[1])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "线圈开路";
                    break;
                case 0x02:
                    result = result + "线圈短路";
                    break;
                case 0x03:
                    result = result + "通道停振";
                    break;
                default:
                    break;
            }
            //result = result + ",冲突灯控板号【" + bpara[1] + "】,冲突灯组号【" + bpara[2] + "】";
        }
        else if (type == 0x03)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "电压，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "电压正常";
                    break;
                case 0x01:
                    result = result + "电压偏低";
                    break;
                case 0x02:
                    result = result + "电压偏高";
                    break;

                default:
                    break;
            }
            result = result + ",电压值【" + bpara[1] + "】";
        }
        else if (type == 0x04)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "温度，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "温度正常";
                    break;
                case 0x01:
                    result = result + "温度偏低,需要风扇加热";
                    break;
                case 0x02:
                    result = result + "温度偏高,需要风扇散热";
                    break;

                default:
                    break;
            }
            result = result + ",温度值【" + bpara[1] + "】";
        }
        else if (type == 0x05)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "电源板，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "与主板通信异常";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "长时间没有通信数据！";
                            break;
                        case 0x01:
                            result = result + "长时间数据错误，地址错误！";
                            break;
                        case 0x02:
                            result = result + "长时间数据错误，检验错误！";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",问题板卡【" + bpara[2] + "】";
        }
        else if (type == 0x06)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "灯控板，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "与主板通信异常";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "长时间没有通信数据！";
                            break;
                        case 0x01:
                            result = result + "长时间数据错误，地址错误！";
                            break;
                        case 0x02:
                            result = result + "长时间数据错误，检验错误！";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",问题板卡【" + bpara[2] + "】";
        }
        else if (type == 0x07)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "检测器，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "与主板通信异常";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "长时间没有通信数据！";
                            break;
                        case 0x01:
                            result = result + "长时间数据错误，地址错误！";
                            break;
                        case 0x02:
                            result = result + "长时间数据错误，检验错误！";
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
            result = result + ",问题板卡【" + bpara[2] + "】";
        }
        else if (type == 0x08)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "黄闪器，";
            switch (bpara[0])
            {

                case 0x01:
                    result = result + "灯泡故障";
                    break;
                case 0x02:
                    result = result + "绿冲突（相位）(主控板判断)";
                    break;
                case 0x03:
                    result = result + "红绿冲突(灯控板判断)";
                    break;
                case 0x04:
                    result = result + "强制黄闪";
                    break;
                case 0x05:
                    result = result + "降级黄闪";
                    break;
                case 0x06:
                    result = result + "主板异常黄闪";
                    break;
                default:
                    break;
            }
            //result = result + ",冲突灯控板号【" + bpara[1] + "】,冲突灯组号【" + bpara[2] + "】";
        }
        else if (type == 0x09)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "程序重起，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常";
                    break;
                case 0x01:
                    result = result + "从主板异常恢复";
                    break;
                case 0x02:
                    result = result + "从红绿冲突故障恢复";
                    break;
                case 0x03:
                    result = result + "从灯泡故障恢复";
                    break;

                default:
                    break;
            }

        }
        else if (type == 0x0a)
        {

            result = result + "修改时间，";
            //增加时间转换
            result = result + DateTimeUtils.utcToLocalTimeString(i);

        }
        else if (type == 0x0b)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "门检测，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "关门";
                    break;
                case 0x01:
                    result = result + "开门";
                    break;

                default:
                    break;
            }

        }
        else if (type == 0x0c)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "手动控制，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "手动";
                    break;
                case 0x01:
                    result = result + "去掉手动，恢复自主控制";
                    break;
                case 0x02:
                    result = result + "黄闪";
                    break;
                case 0x03:
                    result = result + "去掉黄闪";
                    break;
                case 0x04:
                    result = result + "全红";
                    break;
                case 0x05:
                    result = result + "去掉全红";
                    break;
                case 0x06:
                    result = result + "步进";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0d)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "灯控输出异常，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "正常灯色异常";
                    break;
                case 0x01:
                    result = result + "闪烁灯色异常";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0e)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "广播，";
            switch (bpara[0])
            {
                case 0x00:
                    result = result + "广播地址错误";
                    break;
                case 0x01:
                    result = result + "某组灯多亮一盏";
                    break;
                case 0x02:
                    result = result + "灯色黄闪";
                    break;
                case 0x03:
                    result = result + "一块灯板多于8个绿灯亮";
                    break;
                default:
                    break;
            }
        }
        else if (type == 0x0f)
        {
            byte[] bpara =ByteUtils.longToByte(i);
            result = result + "其他类型日志，";
            switch (bpara[0])
            {

                case 0x01:
                    result = result + "控制方式切换";
                    result = result + ",旧的控制方式【" + ControlModelUtils.controlModelToString(bpara[1]) + "】,新的控制方式【" + ControlModelUtils.controlModelToString(bpara[2]) + "】,";
                    switch (bpara[3])
                    {
                        case 0x00:
                            result = result + "正常切换(上位机命令 时段表 面板)";
                            break;
                        case 0x01:
                            result = result + "异常切换  降级";
                            break;

                        default:
                            result = result + "未知";
                            break;
                    }
                    break;
                case 0x02:
                    result = result + "故障恢复，";
                    switch (bpara[1])
                    {
                        case 0x00:
                            result = result + "正常";
                            break;
                        case 0x02:
                            result = result + "从主板异常恢复";
                            break;
                        case 0x03:
                            result = result + "从红绿冲突故障恢复";
                            break;
                        case 0x01:
                            result = result + "从灯泡故障恢复";
                            break;
                        default:
                            result = result + "未知";
                            break;
                    }
                    break;
                default:
                    break;
            }

        }
        else if (type == 0x10)
        {
            byte[] bpara = ByteUtils.longToByte(i);
            result = result + "总线通信异常，总线重起，不影响信号机正常运行。";
        }
        return result;
    }
}
