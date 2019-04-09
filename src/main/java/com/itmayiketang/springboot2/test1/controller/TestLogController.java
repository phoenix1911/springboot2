package com.itmayiketang.springboot2.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/9 16:13.
 */
@RestController
public class TestLogController {
    @RequestMapping("/testlog")
    public String testLog(String name, Integer age) {
        return "success";
    }
}
