package com.itmayiketang.springboot2.mybatis.service;

import com.itmayiketang.springboot2.mybatis.dto.Users;
import com.itmayiketang.springboot2.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tjl on 2019/4/10 11:13.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Users findByUsername(String username) {
        return userMapper.findByName(username);
    }
}
