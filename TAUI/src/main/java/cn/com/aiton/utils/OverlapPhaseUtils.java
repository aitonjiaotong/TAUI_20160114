package cn.com.aiton.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 14-2-23.
 */
public class OverlapPhaseUtils {
    public static String byteArrayToString(byte[] bytes){
        return StringUtils.join(bytes,",");
    }
    public static byte[] stringToByteArray(String str){
        String[] strings = StringUtils.split(str,",");
        byte[] bytes = new byte[16];
        for(int i=0;i<strings.length;i++){
            bytes[i] = Byte.parseByte(strings[i]);
        }
        return bytes;
    }

}
