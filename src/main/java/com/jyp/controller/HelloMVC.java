package com.jyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jyp on 2016/11/18.
 */
@Controller
public class HelloMVC {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String get(){
        System.out.printf("hello----------");
        return "hello";
    }

}
