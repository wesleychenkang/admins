package com.miaoqu.dao;

import com.miaoqu.entity.Menu;

import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 */
public interface MenuDao {
    /**
     * 获取所有菜单
     *
     * @return
     */
    List<Menu> getAllMenu();

    /**
     * 新增菜单
     *
     * @param menu
     */
    void add(Menu menu);

    /**
     * 删除菜单
     *
     * @param tid
     */
    void remove(Integer tid);




}
