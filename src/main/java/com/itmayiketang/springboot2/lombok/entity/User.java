package com.itmayiketang.springboot2.lombok.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Tjl on 2019/4/9 16:41.
 */
@Slf4j
@Data
public class User {


    private String name;
    private int age;

    public static void main(String[] args) {
        User user = new User();
        user.setName("a");
        System.out.println(user.toString());
    }

}
