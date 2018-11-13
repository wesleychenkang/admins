package com.miaoqu.dao;

import com.miaoqu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 */
@Mapper
public interface UserDao {

    List<User> getAllUser();

    void addUser(User user);

    void remove(Integer userId);

    void updateUser(User user);


}
