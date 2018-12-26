package com.miaoqu;

import com.miaoqu.entity.Menu;
import com.miaoqu.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {
    @Autowired
    MenuService service;

    @Test
    public void contextLoads() {
        List<Menu> list = service.getAllMenu();

        for (Menu m: list) {
            System.out.println(m);

        }
//        DataSourceFactory dataSourceFactory;
    }

    @Test
    public void addMean(){
        Menu m = new Menu();
        m.setCreateTime(new Date());
        m.setName("测试菜单2");
        m.setParentID(1);
        m.setPath("/test2");
        service.addMenu(m);
    }
    @Test
    public void removeMean(){
        service.deleteMenu(3);

    }

    @Test
    public void updateMean(){
        Menu m = new Menu();
        m.setCreateTime(new Date());
        m.setName("测试菜单2");
        m.setParentID(1);
        m.setPath("/test2");
        m.setTid(1);
        service.updateMenu(m);
    }

}
