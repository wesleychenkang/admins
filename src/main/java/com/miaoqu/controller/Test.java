package com.miaoqu.controller;

import com.miaoqu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wesley on 2018/10/29.
 */
@RestController
@RequestMapping(value = {"/user"})
public class Test {
    public static final String USER = "/user";
    //    @RequestMapping(value = {"/findAll"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
//    public List getAllUsers() {
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        return list;
//    }
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = {"/index"})
    public String index() {
        menuService.getAllMenu();
        return "index";
    }

}
