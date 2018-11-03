package com.miaoqu.entity;

import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 * 权限
 */
public class Authority {

    /**
     * id
     */
    private Integer tid;

    /**
     * 用户
     */
    private User user;

    /**
     * 角色
     */
    private Role role;

    /**
     * 所拥有的游戏ID集合
     */
    private List<Game> listGames;

    /**
     * 子渠道集合
     */
    private List<Channle> listChannle;

    /**
     * 渠道商集合
     */
    private List<ChannleMaster> listChannleMaster;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Game> getListGames() {
        return listGames;
    }

    public void setListGames(List<Game> listGames) {
        this.listGames = listGames;
    }

    public List<Channle> getListChannle() {
        return listChannle;
    }

    public void setListChannle(List<Channle> listChannle) {
        this.listChannle = listChannle;
    }

    public List<ChannleMaster> getListChannleMaster() {
        return listChannleMaster;
    }

    public void setListChannleMaster(List<ChannleMaster> listChannleMaster) {
        this.listChannleMaster = listChannleMaster;
    }
}
