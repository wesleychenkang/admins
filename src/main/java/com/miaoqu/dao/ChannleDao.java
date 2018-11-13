package com.miaoqu.dao;

import com.miaoqu.entity.Channle;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 * 子渠道Dao
 */
public interface ChannleDao {

    List<Channle> getChannleByMasterId(Integer masterId);

    void addChannle(Channle channle);

    void deleteChannle(Integer channleId);

    List<Channle> getAllChannle();

    void updateChannle(Channle channle);

}
