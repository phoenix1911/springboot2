package com.itmayikekang.springboot2.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/9 14:08.
 */
@RestController
public class test1Controller {
    @RequestMapping("/1")
    public String test1(){
        return "1";
    }

}
