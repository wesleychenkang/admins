package com.miaoqu.service;

import com.miaoqu.dao.MenuDao;
import com.miaoqu.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/11/1.
 */
@Service
public class MenuService {


    @Autowired
    private MenuDao menuDao;

    public List<Menu> getAllMenu() {

        return menuDao.getAllMenu();
    }


}
