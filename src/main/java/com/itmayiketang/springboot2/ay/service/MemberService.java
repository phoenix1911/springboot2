package com.itmayiketang.springboot2.ay.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Tjl on 2019/4/10 10:11.
 */
@Service
@Slf4j
public class MemberService {

    //添加用户时发送邮件
    @Async
    public String addMemberAndEmail() {
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        log.info("3");
        return "itmayiedu";
    }
}
