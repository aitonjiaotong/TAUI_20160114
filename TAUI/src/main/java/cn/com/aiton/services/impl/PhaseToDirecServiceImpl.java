package cn.com.aiton.services.impl;

import net.tsz.afinal.utils.Utils;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtDirec;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.PhaseToDirecService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

/**
 * Created by Administrator on 14-2-23.
 */
public class PhaseToDirecServiceImpl implements PhaseToDirecService {
    /**
     * 从信号中取得方向数据
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtDirec> getPhaseToDirec(TscNode node) {
        List<GbtDirec> gbtDirecs = new ArrayList<GbtDirec>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_PHASE_DIREC);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            byte[] objectArray = new byte[bytes[3] * GbtDefine.PHASE_DIREC_BYTE_SIZE];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);
            byte[][] direcArrayResult = ByteUtils.oneArrayToTwoArray(objectArray, GbtDefine.PHASE_DIREC_RESULT_LEN, GbtDefine.PHASE_DIREC_BYTE_SIZE);
            for(int i=0; i< bytes[3] ;i++){
                GbtDirec gbtDirec = new GbtDirec();
                gbtDirec.setDeviceId(node.getId());
                gbtDirec.setDirecId(ByteUtils.bytesUInt(direcArrayResult[i][0]));
                gbtDirec.setPhaseId(ByteUtils.bytesUInt(direcArrayResult[i][1]));
                gbtDirec.setOverlapId(ByteUtils.bytesUInt(direcArrayResult[i][2]));
                gbtDirec.setRoadCount(ByteUtils.bytesUInt(direcArrayResult[i][3]));
                gbtDirecs.add(gbtDirec);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtDirecs;
    }

    /**
     * 配置方向数据到信号机中
     *
     * @param gbtDirecs
     * @return
     */
    @Override
    public Message setPhaseToDirec(List<GbtDirec> gbtDirecs,TscNode node) {
        Message message = new Message();
        try{
            byte[] hex = ArrayUtils.add(GbtDefine.SET_PHASE_DIREC_RESPONSE, (byte)gbtDirecs.size());
            Iterator<GbtDirec> gbtDirecIterator = gbtDirecs.iterator();
            while(gbtDirecIterator.hasNext()){
                GbtDirec gbtDirec = gbtDirecIterator.next();
                hex = ArrayUtils.add(hex,(byte)gbtDirec.getDirecId());
                hex = ArrayUtils.add(hex,(byte)gbtDirec.getPhaseId());
                hex = ArrayUtils.add(hex,(byte)gbtDirec.getOverlapId());
                hex = ArrayUtils.add(hex,(byte)gbtDirec.getRoadCount());
            }
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), hex);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //yte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            message = CheckGbt.check(bytes);
//TODO   缩写是否成功部分
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return message;
    }
}
