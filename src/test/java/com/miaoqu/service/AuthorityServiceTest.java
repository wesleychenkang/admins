package com.miaoqu.service;

import com.miaoqu.entity.Authority;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by wesley on 2018/12/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorityServiceTest {
    @Autowired
    private AuthorityService authorityService;

    @Test
    public void getAllAuthority() throws Exception {

        List<Authority> list = authorityService.getAllAuthority();

        for (Authority authority : list) {
            System.out.println(authority);
        }

    }

    @Test
    public void getAuthorityById() throws Exception {
        Authority authority = authorityService.getAuthorityById(1);
        System.out.println(authority.toString());
    }

    @Test
    public void updateAuthority() throws Exception {
        Authority authority = new Authority();
        authority.setTid(1);
        authority.setType("test udpate");
        authority.setMenus("1,2,3");
        authorityService.updateAuthority(authority);
    }

    @Test
    public void addAuthority() throws Exception {
        Authority authority = new Authority();
        authority.setTid(1);
        authority.setType("test");
        authority.setMenus("1,2,3");
        authorityService.addAuthority(authority);
    }

    @Test
    public void deleteAuthority() throws Exception {
        authorityService.deleteAuthority(1);
    }

}