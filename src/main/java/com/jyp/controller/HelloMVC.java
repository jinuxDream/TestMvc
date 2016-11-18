package com.jyp.controller;

import com.jyp.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jyp on 2016/11/18.
 */
@Controller
public class HelloMVC {

    @Autowired
    private UserInfoMapper dao;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        System.out.printf("hello----------");
        return "hello";
    }

    @RequestMapping(value = "/getUserList")
    @ResponseBody
    public String getUserList(){

        return dao.getUserList().toString();
    }


}
