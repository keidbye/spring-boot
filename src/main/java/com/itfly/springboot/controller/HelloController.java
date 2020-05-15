package com.itfly.springboot.controller;

import com.itfly.springboot.model.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController

public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        User user = new User(1, "张三");
        log.info("测试一下"+user.getName());
        return "hello world, " +user.getId(); //
    }
}

