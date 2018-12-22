package com.miaoqu.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 * 角色实体
 */
public class Role {
    /**
     * 角色ID
     */
    private Integer tid;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色创建时间
     */
    private Date createTime;
    /**
     * 角色的父角色ID
     */
    private Integer parentID;


    /**
     * 子角色ID集合
     */
    private List<Role> child;

    /**
     * 角色拥有的权限
     */
    private Authority authority;

    /**
     * 权限ID
     */
    private Integer authorityId;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public List<Role> getChild() {
        return child;
    }

    public void setChild(List<Role> child) {
        this.child = child;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", parentID=" + parentID +
                ", child=" + child +
                ", authority=" + authority +
                ", authorityId=" + authorityId +
                '}';
    }
}
