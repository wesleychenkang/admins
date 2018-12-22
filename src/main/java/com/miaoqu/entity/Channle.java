package com.miaoqu.entity;

import java.util.Date;

/**
 * Created by wesley on 2018/10/31.
 * 子渠道
 */
public class Channle {
    private Integer tid;
    private Integer masterId;
    private ChannleMaster channleMaster;
    private String scid;
    private String name;
    private Date createTime;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public ChannleMaster getChannleMaster() {
        return channleMaster;
    }

    public void setChannleMaster(ChannleMaster channleMaster) {
        this.channleMaster = channleMaster;
    }

    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Channle{" +
                "tid=" + tid +
                ", masterId=" + masterId +
                ", channleMaster=" + channleMaster +
                ", scid='" + scid + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
