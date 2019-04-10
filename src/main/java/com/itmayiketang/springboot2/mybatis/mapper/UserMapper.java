package com.itmayiketang.springboot2.mybatis.mapper;

import com.itmayiketang.springboot2.mybatis.dto.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Tjl on 2019/4/10 11:11.
 */
public interface UserMapper {
    @Select("select * from users where username=#{username}")
    Users findByName(@Param("username") String username);
}
