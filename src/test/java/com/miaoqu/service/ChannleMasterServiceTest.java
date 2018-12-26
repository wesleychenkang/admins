package com.miaoqu.service;

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
public class ChannleMasterServiceTest {
    @Autowired
    private ChannleMasterService channleMasterService;

    @Test
    public void getAllChannleMaster() throws Exception {
        List<ChannleMaster> list = channleMasterService.getAllChannleMaster();
        for (ChannleMaster channleMaster : list) {

            System.out.println(channleMaster);
        }
    }

    @Test
    public void addChannleMaster() throws Exception {
        ChannleMaster channleMaster = new ChannleMaster();
        channleMaster.setCreateTime(new Date());
        channleMaster.setMasterId(100002);
        channleMaster.setChannelName("testchannleMaster2");
        channleMasterService.addChannleMaster(channleMaster);

    }

    @Test
    public void updateChannleMaster() throws Exception {
        ChannleMaster channleMaster = new ChannleMaster();
        channleMaster.setCreateTime(new Date());
        channleMaster.setMasterId(100001);
        channleMaster.setChannelName("testchannleMasterUpdate2");
        channleMaster.setTid(1);
        channleMasterService.updateChannleMaster(channleMaster);


    }

    @Test
    public void deleteChannleMaster() throws Exception {
        channleMasterService.deleteChannleMaster(1);

    }

}