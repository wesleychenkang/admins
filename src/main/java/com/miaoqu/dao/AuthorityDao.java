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

    void deleteAuthority(Integer tid);

    void addAuthority(Authority authority);

    Authority getAuthorityById(Integer tid);


}
