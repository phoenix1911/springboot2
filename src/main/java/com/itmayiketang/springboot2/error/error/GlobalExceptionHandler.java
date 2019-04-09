package com.itmayiketang.springboot2.error.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常案例
 * 1.捕获返回json格式
 * 2.捕获返回页面
 * Created by Tjl on 2019/4/9 15:21.
 */
@ControllerAdvice(basePackages = "com.itmayiketang.springboot2.error.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> errorResult() {
        //实际开发中 会有日志记录
        Map<String, Object> errorResultMap = new HashMap<>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("errorMsg","全局捕获异常：系统错误");
        return errorResultMap;
    }
}
