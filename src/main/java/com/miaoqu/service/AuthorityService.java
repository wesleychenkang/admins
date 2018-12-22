package com.miaoqu.service;

import com.miaoqu.dao.AuthorityDao;
import com.miaoqu.entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wesley on 2018/12/3.
 */
@Service
public class AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;

    public List<Authority> getAllAuthority() {

        return authorityDao.getAllAuthority();
    }

    public Authority getAuthorityById(Integer tid) {

        return authorityDao.getAuthorityById(tid);
    }

    public void updateAuthority(Authority authority) {

        authorityDao.updateAuthority(authority);
    }

    public void addAuthority(Authority authority) {
        authorityDao.addAuthority(authority);
    }

    public void deleteAuthority(Integer tid) {

        authorityDao.deleteAuthority(tid);
    }
}
