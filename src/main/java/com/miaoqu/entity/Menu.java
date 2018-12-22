package com.miaoqu.entity;

import java.util.Date;
import java.util.List;
/**
 * Created by wesley on 2018/10/31.
 * <p>
 * 菜单
 * 暂时只支持二级菜单
 *
 */
public class Menu {

    private Integer tid;
    private String name;
    private Integer parentID;
    private String path;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 子菜单集合
     */
    private List<Menu> chaild;

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

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Menu> getChaild() {
        return chaild;
    }

    public void setChaild(List<Menu> chaild) {
        this.chaild = chaild;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", parentID=" + parentID +
                ", path='" + path + '\'' +
                ", createTime=" + createTime +
                ", chaild=" + chaild +
                '}';
    }
}
