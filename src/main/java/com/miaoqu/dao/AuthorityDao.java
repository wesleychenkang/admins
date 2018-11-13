package com.miaoqu.dao;

import com.miaoqu.entity.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wesley on 2018/11/12.
 */
@Mapper
public interface AuthorityDao {

    List<Authority> getAllAuthority();

    void updateAuthority(Authority authority);

    void deleteAutnority(Integer authorityId);

    void addAutnority(Authority authority);

}
