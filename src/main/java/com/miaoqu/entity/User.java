package com.miaoqu.entity;

import java.util.Date;

/**
 * Created by wesley on 2018/10/31.
 */
public class User {

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

    /**
     * 用户拥有的权限
     */
    private Authority authority;

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

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
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
}
