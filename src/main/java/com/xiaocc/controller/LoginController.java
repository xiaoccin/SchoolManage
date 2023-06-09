package com.xiaocc.controller;

import com.xiaocc.pojo.Result;
import com.xiaocc.pojo.User;
import com.xiaocc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService service;

    @PostMapping
    public Result  login(@RequestBody User user){
        log.info("用户登陆:{}",user);
        User e = service.login(user);
        return e!=null?Result.success():Result.error("用户名或密码错误");
    }
}
