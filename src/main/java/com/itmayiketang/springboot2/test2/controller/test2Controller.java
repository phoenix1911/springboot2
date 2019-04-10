package com.itmayiketang.springboot2.test2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/9 14:10.
 */
@RestController
public class test2Controller {

    @Value("${name}")
    private String name;

    @RequestMapping("/2")
    public String test2() {
        return "2 "+name;
    }
}
