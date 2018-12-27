package com.miaoqu.controller;

import com.miaoqu.entity.Admin;
import com.miaoqu.pojo.ResultModel;
import com.miaoqu.pojo.User;
import com.miaoqu.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wesley on 2018/12/14.
 */
@Api(value = "用户登录管理类")
@RestController
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    /**
     * 登录
     *
     * @param user
     */
    @ApiOperation(value = "用于登录方法操作")
    @ApiImplicitParam(name = "user", value = "用户登录参数", dataType = "User")
    @RequestMapping(value = "/login")
    public ResultModel<Admin> login(User user) {

        if (user.getName() == null || user.getPassWord() == null || user.getName().trim().length() == 0 || user.getPassWord().trim().length() == 0) {

            return ResultModel.failure("name or password is null", 10001);
        }
        Admin temp = adminService.getAdmin(user.getName(), user.getPassWord());
        if (null == temp) {

            return ResultModel.failure("login fail", 10001);
        }

        return ResultModel.success(temp, "login success");
    }

    /**
     * 更新用户
     *
     * @param admin
     */
    @ApiOperation(value = "更新用户")
    @ApiImplicitParam(name = "admin", value = "新用户信息", dataType = "User")
    @RequestMapping(value = "/updateAdmin")
    public ResultModel<Admin> updateAdmin(User admin) {
        if (admin.getPassWord() == null || admin.getName() == null) {
            return ResultModel.failure("name or password is null");
        }
        try {
            Admin temp = new Admin();
            temp.setTid(admin.getTid());
            temp.setName(admin.getName());
            temp.setPassWord(admin.getPassWord());
            int r = adminService.updateAdmin(temp);
            if (r > 0) {

                return ResultModel.success(temp, "update success");
            }

        } catch (Exception e) {

            return ResultModel.failure(MSG, 1002);
        }
        return ResultModel.failure(MSG);

    }

    /**
     * 新增用户
     *
     * @param admin
     */
    @RequestMapping(value = "/addAmin")
    @ApiOperation(value = "用于新增用户")
    public ResultModel<Admin> addAdmin(User admin) {
        if (admin.getPassWord() == null || admin.getName() == null) {
            return ResultModel.failure("name or password is null");
        }
        try {
            Admin temp = new Admin();
            temp.setName(admin.getName());
            temp.setPassWord(admin.getPassWord());
            adminService.addAdmin(temp);
            return ResultModel.success(temp, "add success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultModel.failure("add fail" + e.getMessage());
        }
    }


    /**
     * 删除用户
     *
     * @param admin
     */
    @ApiOperation(value = "删除用户接口")
    @RequestMapping(value = "/deleteAdmin")
    public ResultModel<Admin> deleteAdmin(User admin) {
        Map<String, Object> map = new HashMap<>();
        if (admin.getPassWord() == null || admin.getName() == null || admin.getTid() == null) {
            return ResultModel.failure("name , tid  or password is null");
        }
        try {
            int r = adminService.deleteAdmin(admin.getTid());
            if (r > 0) {
                return ResultModel.success("SUCCESS");
            } else {
                return ResultModel.failure("delelte by tid");
            }
        } catch (Exception e) {

            return ResultModel.failure(e.getMessage(), 1002);
        }

    }


}
