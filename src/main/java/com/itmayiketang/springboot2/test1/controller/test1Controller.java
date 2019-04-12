package com.itmayiketang.springboot2.test1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/9 14:08.
 */
@RestController
public class test1Controller {

    @Value("${http_url}")
    private String http_url;

    @RequestMapping("/1")
    public String test1(){
        return "12 " +"http_url: "+http_url;
    }

    @RequestMapping("/3")
    public String test2(){
        String result = "springboot";
        Integer age = 3;
        return result+age;
    }

    @RequestMapping("/4")
    public String test3(){
        String result = "springboot";
        Integer age = 3;
        return result+age;
    }

    @RequestMapping("/5")
    public String test4(){
        String result = "springboo";
        Integer age = 3;
        return result+age;
    }





}
