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

    /**
     * 获取所有菜单
     *
     * @return
     */
    public List<Menu> getAllMenu() {
        return menuDao.getAllMenu();
    }

    /**
     * 添加菜单
     *
     * @param menu
     */
    public void addMenu(Menu menu) {
        menuDao.addMenu(menu);
    }

    /**
     * 删除菜单
     *
     * @param tid
     */
    public void deleteMenu(Integer tid) {
        menuDao.deleteMenu(tid);
    }

    /**
     * 更新菜单
     * @param menu
     */
    public void updateMenu(Menu menu) {
        menuDao.updateMenu(menu);
    }

}
