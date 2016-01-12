package cn.com.aiton.services;


import java.util.List;

import cn.com.aiton.domain.GbtCollision;
import cn.com.aiton.domain.Message;
import cn.com.aiton.domain.TscNode;

/**
 * Created by Administrator on 14-2-14.
 */
public interface CollisionService {
    /**
     * 取得16位信号机的绿冲突数据
     * @param node
     * @return
     */
    public List<GbtCollision> getCollisionBy16Phase(TscNode node);

    /**
     * 取得32相位信号机的绿冲突数据
     * @param node
     * @return
     */
    public List<GbtCollision> getCollisionBy32Phase(TscNode node);

    /**
     * 将配置的数据发送给某个信号机
     * @param gbtCollisions
     * @param node
     * @return
     */
    public Message setCollision(List<GbtCollision> gbtCollisions, TscNode node);


}
