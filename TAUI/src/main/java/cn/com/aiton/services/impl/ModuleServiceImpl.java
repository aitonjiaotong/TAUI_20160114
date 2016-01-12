package cn.com.aiton.services.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.aiton.domain.GbtModule;
import cn.com.aiton.domain.TscNode;
import cn.com.aiton.services.ModuleService;
import cn.com.aiton.utils.ByteUtils;
import cn.com.aiton.utils.CheckGbt;
import cn.com.aiton.utils.GbtDefine;
import cn.com.aiton.utils.UdpClientSocket;

public class ModuleServiceImpl implements ModuleService {
    /**
     * 得到信号机的模块信号
     *
     * @param node
     * @return
     */
    @Override
    public List<GbtModule> getModule(TscNode node) {
        List<GbtModule> gbtModules = new ArrayList<GbtModule>();
        List<byte[]> everyByteArray = new ArrayList<byte[]>();
        try{
            UdpClientSocket client = new UdpClientSocket();
            client.send(node.getIpAddress(), node.getPort(), GbtDefine.GET_MODULE);
            byte[] bytes = client.receiveByte(node.getIpAddress(), node.getPort());
            //byte[] bytes = ByteUtils.stringToByteArrayByISO(info);
            //System.out.println("服务端回应数据：" + info);
            if(!CheckGbt.check(bytes).isBoo()){
                return null;
            }
            //去除协议头
            byte[] objectArray = new byte[bytes.length - 4];
            System.arraycopy(bytes,4,objectArray,0,objectArray.length);

            int count = 0;
            int modules = bytes[3];
            //一条记录的长度
            for (int i=0;i<modules;i++){
                int idcount = 1;
                int devNode = objectArray[1+count];
                //这里加1是因为有一个字节 的设备节点长度。并不是数据
                int company = objectArray[devNode + 1 + count +idcount];
                //这里加2 = 1（devNode长度字节）+ 1（company长度字节）。并不是数据
                int model = objectArray[devNode + 2 + company + count + idcount];
                //这里加3 = 1（devNode长度字节）+ 1（company长度字节）+ 1（model长度字节）。并不是数据
                int version = objectArray[devNode + 3 + model + company + count + idcount];
                int typeCount = 1;
                //最后 加上4， 是因为，有四个字段的字节长度属性，并不是真正的数据
                int all = idcount + devNode + company + model + version + typeCount + 4;
                byte[] oneSetByteArray = new byte[all];
                System.arraycopy(objectArray,count,oneSetByteArray,0,all);
                everyByteArray.add(oneSetByteArray);
                count = count + all;
            }

            Iterator it = everyByteArray.iterator();
            while(it.hasNext()){
                byte[] bar = (byte[])it.next();
                int idCount = 1;
                int devNodeCount = bar[1];
                int companyCount = bar[devNodeCount + 1 + idCount];
                int modelCount = bar[devNodeCount + 2 + companyCount + idCount];
                int versionCount = bar[devNodeCount + 3 + companyCount + modelCount + idCount];
                //取得节点
                byte[] byteDevNode = new byte[devNodeCount];
                idCount += 1;
                for(int j = 0 ; j<devNodeCount ; j++){
                    byteDevNode[j] = bar[j + idCount];
                }
                String sDevNode = ByteUtils.byteArrayToStringByISO(byteDevNode);
                //取得厂家数据
                byte[] byteCompany = new byte[companyCount];
                devNodeCount+=1;
                for (int k=0;k<companyCount;k++){
                    byteCompany[k] = bar[idCount + devNodeCount + k];
                }
                String sCompany = ByteUtils.byteArrayToStringByISO(byteCompany);
                //取得模式
                byte[] byteModel = new byte[modelCount];
                companyCount += 1;
                for (int l=0;l<modelCount;l++){
                    byteModel[l] = bar[idCount + devNodeCount + companyCount + l];
                }
                String sModel = ByteUtils.byteArrayToStringByISO(byteModel);
                //取得 版本号
                byte[] byteVersion = new byte[versionCount];
                modelCount += 1;
                for (int u=0;u<versionCount;u++){
                    byteVersion[u] = bar[idCount + devNodeCount+ modelCount + companyCount + u];
                }
                String sVersion = ByteUtils.byteArrayToStringByISO(byteVersion);
                GbtModule gbtModule = new GbtModule();
                gbtModule.setDeviceId(node.getId());
                gbtModule.setModuleId(bar[0]);
                gbtModule.setDeviceNode(sDevNode);
                gbtModule.setFactory(sCompany);
                gbtModule.setModel(sModel);
                gbtModule.setVersion(sVersion);
                gbtModule.setType(bar[idCount + devNodeCount + modelCount + companyCount + versionCount]);
                gbtModules.add(gbtModule);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return gbtModules;
    }

    /**
     * 当前信号机各个板卡的状态
     *
     * @param node
     * @return
     */
    @Override
    public byte[] getModuleState(TscNode node) {
        return new byte[0];
    }
}
