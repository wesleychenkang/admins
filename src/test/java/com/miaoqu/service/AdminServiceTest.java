package com.miaoqu.service;

import com.miaoqu.entity.Admin;
import com.miaoqu.entity.Channle;
import com.miaoqu.entity.ChannleMaster;
import com.miaoqu.entity.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void getAdmin() throws Exception {
        System.out.println("方法为何会被调用");
        Admin admin = adminService.getAdmin("chenkangzhi update2", "1234567");
        System.out.println(admin);
    }

    @Test
    public void deleteAdmin() throws Exception {
        int r = adminService.deleteAdmin(1);
        System.out.println(r); //可以返回受影响的行数
    }

    @Test
    public void updateAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        admin.setName("chenkangzhi update2");
        admin.setParentId(null);
        admin.setPassWord("1234567");
        admin.setRoleId(1);
        admin.setTid(3);
        int r = adminService.updateAdmin(admin);
        System.out.println("r=" + r);
    }

    @Test
    public void getAllAdmin() throws Exception {
        List<Admin> list = adminService.getAllAdmin();
        for (Admin admin : list) {
            System.out.println(admin);
        }
    }

    @Test
    public void addAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        admin.setName("chenkangzhi");
        admin.setParentId(null);
        admin.setPassWord("123456");
        admin.setRoleId(1);
        adminService.addAdmin(admin);
    }

    @Test
    public void getAllAdminGame() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        admin.setParentId(1);
        List<Game> l = adminService.getAdminGames(admin);
        for (Game g : l) {
            System.out.println(g);
        }
    }

    @Test
    public void getAdminChannleMaster() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        admin.setParentId(null);
        List<ChannleMaster> list = adminService.getAdminChannleMaster(admin);
        for (ChannleMaster m : list) {
            System.out.println(m);
        }
    }

    @Test
    public void getAdminChannle() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        admin.setParentId(1);
        List<Channle> list = adminService.getAdminChannle(admin);
        for (Channle c : list
                ) {
            System.out.println(c);
        }

    }


    @Test
    public void addAdminGames() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        List<Game> list = new ArrayList<>();
        Game g = new Game();
        g.setTid(2);
        list.add(g);
        Game g1 = new Game();
        g1.setTid(1);
        list.add(g1);
        admin.setGames(list);
        adminService.addAdminGames(admin);
    }

    @Test
    public void addAdminChannles() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        List<Channle> list = new ArrayList<>();
        Channle c = new Channle();
        c.setTid(2);
        list.add(c);
        Channle c1 = new Channle();
        c1.setTid(1);
        list.add(c1);
        admin.setChannles(list);
        adminService.addAdminChannles(admin);
    }

    @Test
    public void addAdminChannleMasters() throws Exception {
        Admin admin = new Admin();
        admin.setTid(3);
        List<ChannleMaster> list = new ArrayList<>();
//        ChannleMaster c = new ChannleMaster();
//        c.setTid(2);
//        list.add(c);
//        ChannleMaster c1 = new ChannleMaster();
//        c1.setTid(1);
//        list.add(c1);
        admin.setChannleMasters(list);
        adminService.addAdminChannleMasters(admin);
    }


}