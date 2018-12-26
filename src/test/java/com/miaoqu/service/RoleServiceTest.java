package com.miaoqu.service;

import com.miaoqu.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wesley on 2018/11/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void addRole() throws Exception {
        Role role = new Role();
        role.setName("admin");
        role.setChild(null);
        role.setParentID(null);
        role.setCreateTime(new Date());
        role.setAuthorityId(2);
        // role.set
//        role.setList(list);
        roleService.addRole(role);
    }

    @Test
    public void deleteRole() throws Exception {
        roleService.deleteRole(1);
    }

    @Test
    public void updateRole() throws Exception {
        Role role = new Role();
        role.setName("admin update");
        role.setChild(null);
        role.setParentID(null);
        role.setCreateTime(new Date());
        role.setAuthorityId(2);
        role.setTid(1);
        //role.setList(list);
        roleService.updateRole(role);
    }

    @Test
    public void getAllRole() throws Exception {
        List<Role> list = roleService.getAllRole();
        for (Role r : list) {
            System.out.println(r);
        }
    }

}