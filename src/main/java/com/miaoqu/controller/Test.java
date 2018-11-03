package com.miaoqu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wesley on 2018/10/29.
 */
@RestController
@RequestMapping(value = {"/user"})
public class Test {
//    @RequestMapping(value = {"/findAll"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
//    public List getAllUsers() {
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        return list;
//    }

    @RequestMapping(value = {"/index"})
    public String index() {

       return "index";
    }

}
