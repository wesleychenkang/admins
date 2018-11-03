package com.miaoqu.entity;

/**
 * Created by wesley on 2018/10/31.
 * 子渠道
 */
public class Channle {
    private Integer tid;
    private ChannleMaster channleMaster;
    private String scid;
    private String name;

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
}
