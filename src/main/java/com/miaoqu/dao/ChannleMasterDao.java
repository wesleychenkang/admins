package com.miaoqu.dao;

import com.miaoqu.entity.ChannleMaster;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 */
@Mapper
public interface ChannleMasterDao {

    List<ChannleMaster> getAllChannleMaster();

    void updateChannleMaster(ChannleMaster channleMaster);

    void deleteChannleMaster(Integer channleMasterId);

    void addChannleMaster(ChannleMaster channleMaster);


}
