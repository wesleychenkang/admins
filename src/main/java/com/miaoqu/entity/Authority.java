package com.miaoqu.entity;

import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 * 权限 指定菜单集合
 * 页面点集合，后续添加
 */
public class Authority {

    /**
     * id
     */
    private Integer tid;

    /**
     * 权限类型
     */
    private String type;

    /**
     * 菜单选项组（用逗号隔开）
     */
    private String menus;

    /**
     * 菜单集合
     */
    private List<Menu> listMenu;

    public List<Menu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<Menu> listMenu) {
        this.listMenu = listMenu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getMenus() {
        return menus;
    }

    public void setMenus(String menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "tid=" + tid +
                ", type='" + type + '\'' +
                ", menus='" + menus + '\'' +
                '}';
    }
}
