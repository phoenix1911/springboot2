package com.itmayiketang.springboot2.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 整合freemarker
 * Created by Tjl on 2019/4/9 14:31.
 */
@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map) {
        map.put("name", "家龙");
        map.put("age",22);
        map.put("sex", "0");
        return "ftlIndex";
    }
}
