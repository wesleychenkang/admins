package com.miaoqu.service;

import com.miaoqu.dao.RoleDao;
import com.miaoqu.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/11/16.
 */
@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public void addRole(Role role) {
        roleDao.addRole(role);

    }

    public void deleteRole(Integer tid) {

        roleDao.deleteRole(tid);
    }

    public void updateRole(Role role) {

        roleDao.updateRole(role);
    }

    public List<Role> getAllRole() {

        return roleDao.getAllRole();
    }
}
