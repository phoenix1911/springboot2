package com.itmayiketang.springboot2.ay.controller;

import com.itmayiketang.springboot2.ay.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 同步1234 异步1423
 * Created by Tjl on 2019/4/10 10:10.
 */
@RestController
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("/addMemberAndEmail")
    public String addMemberAndEmail() {
        log.info("1");
        String result = memberService.addMemberAndEmail();
        log.info("4");
        return result;
    }


}
