package com.miaoqu.controller;

import com.miaoqu.entity.Admin;
import com.miaoqu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wesley on 2018/12/14.
 */
@RestController
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    /**
     * 登录
     *
     * @param admin
     */
    @RequestMapping(value = "/login")
    public Map<String, Object> login(Admin admin) {
        Map<String, Object> map = new HashMap<>();
        if (admin.getName() == null || admin.getPassWord() == null || admin.getName().trim().length() == 0 || admin.getPassWord().trim().length() == 0) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1001);
            map.put(MSG, "name or password is null");
            return map;
        }
        Admin temp = adminService.getAdmin(admin.getName(), admin.getPassWord());
        if (null == temp) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1002);
            map.put(MSG, "login fail");
            return map;
        }
        // 用户的渠道
//        List<Channle>  list_Channle = adminService.getAdminChannle(temp);
//        temp.setChannles(list_Channle);

        //用户的游戏
//        List<Game> list_game =  adminService.getAdminGames(temp);
//        temp.setGames(list_game);

        //用户的渠道商
//        List<ChannleMaster> list_channle_master =  adminService.getAdminChannleMaster(temp);
//        temp.setChannleMasters(list_channle_master);


        map.put(STATUS, SUCCESS);
        return map;
    }

    /**
     * 更新用户
     *
     * @param admin
     */
    @RequestMapping(value = "/updateAdmin")
    public Map<String, Object> updateAdmin(Admin admin) {
        Map<String, Object> map = new HashMap<>();
        if (admin.getPassWord() == null || admin.getName() == null) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1001);
            map.put(MSG, "name or password is null");
        }
        try {
            int r = adminService.updateAdmin(admin);
            if (r > 0) {
                map.put(STATUS, SUCCESS);
                map.put(ERROR, 0);
            }

        } catch (Exception e) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1002);
            map.put(MSG, e.getMessage());
        }
        return map;
    }

    /**
     * 新增用户
     *
     * @param admin
     */
    @RequestMapping(value = "/addAmin")
    public Map<String, Object> addAdmin(Admin admin) {
        Map<String, Object> map = new HashMap<>();
        if (admin.getPassWord() == null || admin.getName() == null) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1001);
            map.put(MSG, "name or password is null");
        }
        try {
            adminService.addAdmin(admin);
            map.put(STATUS, SUCCESS);
            map.put(ERROR, 0);
        } catch (Exception e) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1002);
            map.put(MSG, e.getMessage());
        }
        return map;
    }


    /**
     * 删除用户
     *
     * @param admin
     */
    @RequestMapping(value = "/deleteAdmin")
    public Map<String, Object> deleteAdmin(Admin admin) {
        Map<String, Object> map = new HashMap<>();
        if (admin.getPassWord() == null || admin.getName() == null) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1001);
            map.put(MSG, "name or password is null");
        }
        try {
            int r = adminService.deleteAdmin(admin.getTid());
            if(r>0) {
                map.put(STATUS, SUCCESS);
                map.put(ERROR, 0);
            }else{
                map.put(STATUS, FAIL);
                map.put(ERROR, 0);
            }
        } catch (Exception e) {
            map.put(STATUS, FAIL);
            map.put(ERROR, 1002);
            map.put(MSG, e.getMessage());
        }
        return map;
    }


}
