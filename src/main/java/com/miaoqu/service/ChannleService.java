package com.miaoqu.service;

import com.miaoqu.dao.ChannleDao;
import com.miaoqu.entity.Channle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/11/15.
 */
@Service
public class ChannleService {

    @Autowired
    private ChannleDao channleDao;

    public List<Channle> getAllChannle() {
        return channleDao.getAllChannle();
    }

    public void updateChannle(Channle channle) {
        channleDao.updateChannle(channle);
    }

    public void deleteChannle(Integer tid) {
        channleDao.deleteChannle(tid);
    }

    public void addChannle(Channle channle) {
        channleDao.addChannle(channle);
    }

    public List<Channle> getChannleByMasterId(Integer masterId){

        return  channleDao.getChannleByMasterId(masterId);
    }
}
