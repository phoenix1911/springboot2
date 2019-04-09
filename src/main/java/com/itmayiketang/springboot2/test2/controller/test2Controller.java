package com.itmayiketang.springboot2.test2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/9 14:10.
 */
@RestController
public class test2Controller {
    @RequestMapping("/2")
    public String test2() {
        return "2";
    }
}
