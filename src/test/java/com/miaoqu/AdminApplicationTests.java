package com.miaoqu;

import com.miaoqu.entity.Menu;
import com.miaoqu.service.MenuService;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {
    @Autowired
    MenuService service;

    @Test
    public void contextLoads() {
        List<Menu> list = service.getAllMenu();
//        DataSourceFactory dataSourceFactory;
    }

}
