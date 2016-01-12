package cn.com.aiton.utils;

import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 2014/11/21.
 */
public class SearchTscUtil {
    public static TscNode bytesToTscNode(byte[] bytes){
        TscNode node = new TscNode();
        node.setIpAddress(bytes[0]+"."+bytes[1]+"."+bytes[2]+"."+bytes[3]);
        String port1 = Integer.toHexString(bytes[6]);
        String port2 = Integer.toHexString(bytes[7]);
        String port = port1+port2;
        int iport = Integer.parseInt(port);
        node.setPort(iport);
        node.setVersion(bytes[8] +""+bytes[9]+""+bytes[10]);
        return node;
    }
}
