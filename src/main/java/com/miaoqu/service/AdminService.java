package com.miaoqu.service;

import com.miaoqu.dao.AdminDao;
import com.miaoqu.entity.Admin;
import com.miaoqu.entity.Channle;
import com.miaoqu.entity.ChannleMaster;
import com.miaoqu.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by wesley on 2018/12/4.
 */
@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private GameService gameService;

    @Autowired
    private ChannleMasterService channleMasterService;

    @Autowired
    private ChannleService channleService;

    /**
     * 通过用户名和密码查询用户
     *
     * @param name
     * @param passWord
     * @return
     */
    public Admin getAdmin(String name, String passWord) {

        return adminDao.getAdmin(name, passWord);
    }

    /**
     * 删除用户
     *
     * @param tid
     */
    public int deleteAdmin(Integer tid) {
        return adminDao.deleteAdmin(tid);
    }

    /**
     * 更新用户
     *
     * @param admin
     */
    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    /**
     * 获取所有用户
     *
     * @return
     */
    public List<Admin> getAllAdmin() {
        return adminDao.getAllAdmin();
    }

    public void addAdmin(Admin admin) {
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        adminDao.addAdmin(admin);
    }

    /**
     * 获取用户所有游戏
     *
     * @param admin
     * @return
     */
    public List<Game> getAdminGames(Admin admin) {
        if (null == admin.getParentId()) {
            return gameService.getAllGame();
        } else {
            return adminDao.getAdminGames(admin.getTid());
        }
    }

    /**
     * 获取用户所有的渠道商
     *
     * @param admin
     * @return
     */
    public List<ChannleMaster> getAdminChannleMaster(Admin admin) {

        if (null == admin.getParentId()) {
            return channleMasterService.getAllChannleMaster();
        } else {
            return adminDao.getAdminChannleMaster(admin.getTid());

        }

    }

    /**
     * 获取用户所有的子渠道
     *
     * @param admin
     * @return
     */
    public List<Channle> getAdminChannle(Admin admin) {
        if (null == admin.getParentId()) {
            return channleService.getAllChannle();
        } else {
            return adminDao.getAdminChannle(admin.getTid());
        }

    }


    /**
     * 用户新增游戏
     *
     * @param admin
     */
    public void addAdminGames(Admin admin) {

        //得到传入过来的所有游戏id集合
        List<Game> newList = admin.getGames();
        List<Integer> newTid = new ArrayList<>();
        for (Game game : newList) {
            newTid.add(game.getTid());
        }
        // 需要拿到所有传入过来的tid,并获取原有的tid
        List<Game> all = adminDao.getAdminGames(admin.getTid());
        Iterator<Game> iterator = all.iterator();//得到原有的集合
        List<Integer> older_tid = new ArrayList<>();
        while (iterator.hasNext()) {
            Integer t = iterator.next().getTid();
            older_tid.add(t);
        }
        // 查出新增加的游戏ID
        for (Integer game : newTid) {
            if (!older_tid.contains(game)) { // 添加成功才添加到数据库
                adminDao.addAdminGames(admin.getTid(), game);
            }
        }
        //查出需要删除游戏ID
        if (newTid.size() > 0) {
            for (Integer d : older_tid) {
                if (!newTid.contains(d)) {
                    adminDao.deleteAdminGame(admin.getTid(), d);
                }
            }
        } else {
            //传入的gameId为null应该删除所有的gameId
            adminDao.deleteAdminGame(admin.getTid(), null);
        }

    }


    /**
     * 用户新增渠道
     *
     * @param admin
     */
    public void addAdminChannles(Admin admin) {
        //得到编辑后的

        //得到传入过来的所有游戏id集合
        List<Channle> newList = admin.getChannles();
        List<Integer> newTid = new ArrayList<>();
        for (Channle channle : newList) {
            newTid.add(channle.getTid());
        }
        // 需要拿到所有传入过来的tid,并获取原有的tid
        List<Channle> all = adminDao.getAdminChannle(admin.getTid());
        Iterator<Channle> iterator = all.iterator();//得到原有的集合
        List<Integer> older_tid = new ArrayList<>();
        while (iterator.hasNext()) {
            Integer t = iterator.next().getTid();
            older_tid.add(t);
        }
        // 查出新增加的游戏ID
        for (Integer game : newTid) {
            if (!older_tid.contains(game)) { // 添加成功才添加到数据库
                adminDao.addAdminChannles(admin.getTid(), game);
            }
        }
        //查出需要删除游戏ID
        if (newTid.size() > 0) {
            for (Integer d : older_tid) {
                if (!newTid.contains(d)) {
                    adminDao.deleteAdminChannle(admin.getTid(), d);
                }
            }
        } else {
            //传入的channleId为null应该删除所有的channleId
            adminDao.deleteAdminChannle(admin.getTid(), null);
        }

    }

    /**
     * 用户新增渠道商
     *
     * @param admin
     */
    public void addAdminChannleMasters(Admin admin) {

        //得到编辑后的

        //得到传入过来的所有id集合
        List<ChannleMaster> newList = admin.getChannleMasters();
        List<Integer> newTid = new ArrayList<>();
        for (ChannleMaster channle : newList) {
            newTid.add(channle.getTid());
        }
        // 需要拿到所有传入过来的tid,并获取原有的tid
        List<ChannleMaster> all = adminDao.getAdminChannleMaster(admin.getTid());
        Iterator<ChannleMaster> iterator = all.iterator();//得到原有的集合
        List<Integer> older_tid = new ArrayList<>();
        while (iterator.hasNext()) {
            Integer t = iterator.next().getTid();
            older_tid.add(t);
        }
        // 查出新增加的游戏ID
        for (Integer game : newTid) {
            if (!older_tid.contains(game)) { // 添加成功才添加到数据库
                adminDao.addAdminChannleMasters(admin.getTid(), game);
            }
        }
        //查出需要删除的ID
        if (newTid.size() > 0) {
            for (Integer d : older_tid) {
                if (!newTid.contains(d)) {
                    adminDao.deleteAdminChannleMaster(admin.getTid(), d);
                }
            }
        } else {
            //传入的channleId为null应该删除所有的channleId
            adminDao.deleteAdminChannleMaster(admin.getTid(), null);
        }

    }


}
