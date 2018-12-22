package com.miaoqu.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 */
public class Admin {

    /**
     * tid
     */
    private Integer tid;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String passWord;

    private Integer roleId;

    /**
     * 用户拥有角色
     */
    private Role role;

    /**
     * 用户拥有的Games集合
     */
    private List<Game> games;
    /**
     * 用户拥有的渠道商集合
     */
    private List<ChannleMaster> channleMasters;

    /**
     * 用户拥有的子渠道集合
     */
    private List<Channle> channles;

    /**
     * 父ID
     */
    private Integer parentId;


    private Date createTime;

    private Date updateTime;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<ChannleMaster> getChannleMasters() {
        return channleMasters;
    }

    public void setChannleMasters(List<ChannleMaster> channleMasters) {
        this.channleMasters = channleMasters;
    }

    public List<Channle> getChannles() {
        return channles;
    }

    public void setChannles(List<Channle> channles) {
        this.channles = channles;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", roleId=" + roleId +
                ", role=" + role +
                ", games=" + games +
                ", channleMasters=" + channleMasters +
                ", channles=" + channles +
                ", parentId=" + parentId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
