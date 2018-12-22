package com.miaoqu.service;

import com.miaoqu.dao.ChannleMasterDao;
import com.miaoqu.entity.ChannleMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/11/15.
 */
@Service
public class ChannleMasterService {

    @Autowired
    private ChannleMasterDao channleMasterDao;

    public List<ChannleMaster> getAllChannleMaster() {
        return channleMasterDao.getAllChannleMaster();
    }

    public void addChannleMaster(ChannleMaster channleMaster) {
        channleMasterDao.addChannleMaster(channleMaster);
    }

    public void updateChannleMaster(ChannleMaster channleMaster) {

        channleMasterDao.updateChannleMaster(channleMaster);
    }

    public void deleteChannleMaster(Integer tid) {

        channleMasterDao.deleteChannleMaster(tid);
    }
}
