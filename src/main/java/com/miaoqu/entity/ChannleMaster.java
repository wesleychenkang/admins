package com.miaoqu.entity;

import java.util.Date;

/**
 * Created by wesley on 2018/10/31.
 * 渠道商
 */
public class ChannleMaster {

    private Integer tid;
    private String channelName;
    private Integer masterId;
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    @Override
    public String toString() {
        return "ChannleMaster{" +
                "tid=" + tid +
                ", channelName='" + channelName + '\'' +
                ", masterId=" + masterId +
                ", createTime=" + createTime +
                '}';
    }


}
