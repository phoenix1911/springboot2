package com.itmayiketang.springboot2.error.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局捕获异常
 * Created by Tjl on 2019/4/9 15:13.
 */
@RestController
public class ErrorController {

    @RequestMapping("/getUser")
    public String getUser(int i) {
        int j = 0;
        j=1/i;
        return "seccess" + j;

    }
}

