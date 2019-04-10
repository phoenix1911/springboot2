package com.itmayiketang.springboot2.mybatis.controller;

import com.itmayiketang.springboot2.mybatis.dto.Users;
import com.itmayiketang.springboot2.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tjl on 2019/4/10 11:17.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public Users findUserByUsername(String username) {
        return userService.findByUsername(username);
    }
}
