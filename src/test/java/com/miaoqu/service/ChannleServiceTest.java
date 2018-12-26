package com.miaoqu.service;

import com.miaoqu.entity.Channle;
import com.miaoqu.entity.ChannleMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/11/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannleServiceTest {

    @Autowired
    private ChannleService channleService;

    @Test
    public void getAllChannle() throws Exception {
        List<Channle> list = channleService.getAllChannle();
        for (Channle channle : list) {

            System.out.println(channle);
        }
    }

    @Test
    public void updateChannle() throws Exception {
        Channle channle = new Channle();
        channle.setTid(1);
        channle.setName("testChannlenew");
        ChannleMaster channleMaster = new ChannleMaster();
        channleMaster.setTid(1);
        channle.setChannleMaster(channleMaster);
        channle.setScid("scid2");
        channleService.updateChannle(channle);
    }

    @Test
    public void deleteChannle() throws Exception {
        channleService.deleteChannle(1);
    }

    @Test
    public void addChannle() throws Exception {
        Channle channle = new Channle();
        channle.setTid(1);
        channle.setName("testChannle");
        channle.setMasterId(1);
        channle.setScid("scid");
        channle.setCreateTime(new Date());
        channleService.addChannle(channle);
    }
    @Test
    public void getChannleByMasterId() throws Exception {
        List<Channle> list = channleService.getChannleByMasterId(1);
        for (Channle channle : list) {
            System.out.println(channle);
        }
    }

}