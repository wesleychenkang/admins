package com.miaoqu.dao;

import com.miaoqu.entity.Menu;
import com.miaoqu.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Wesley on 2018/11/12.
 */


@Mapper
public interface RoleDao {

    List<Role> getAllRole();

    void udateRole(Role role);

    void removeRole(Integer roleId);

    void addRole(Role role);

}
