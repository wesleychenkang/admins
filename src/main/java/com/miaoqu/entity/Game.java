package com.miaoqu.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/10/31.
 * 游戏实体类
 */
public class Game {

    private Integer tid;
    private String gameName;
    private Date createTime;
    private Date updateTime;
    private Integer parentID;
    private List<Game> child;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
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


    public List<Game> getChild() {
        return child;
    }

    public void setChild(List<Game> child) {
        this.child = child;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }
}
