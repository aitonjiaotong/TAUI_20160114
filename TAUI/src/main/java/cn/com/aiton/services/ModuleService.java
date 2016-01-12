package cn.com.aiton.services;


import java.util.List;

import cn.com.aiton.domain.GbtModule;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface ModuleService {
    /**
     * 得到信号机的模块信号
     * @param node
     * @return
     */
    public List<GbtModule> getModule(TscNode node);

    /**
     * 当前信号机各个板卡的状态
     * @param node
     * @return
     */
    public byte[] getModuleState(TscNode node);
}
