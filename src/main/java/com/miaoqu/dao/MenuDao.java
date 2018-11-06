package com.miaoqu.dao;

import com.miaoqu.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 */
@Mapper
public interface MenuDao {
    /**
     * 获取所有菜单
     *
     * @return
     */
    //@Select("select * from menu")
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


    int getCount();


}
