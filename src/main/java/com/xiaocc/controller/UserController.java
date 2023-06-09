package com.xiaocc.controller;


import com.xiaocc.pojo.Result;
import com.xiaocc.pojo.User;
import com.xiaocc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public Result list(){
        log.info("查询所有用户信息");
        List<User> userList= service.list();
        return Result.success(userList);
    }
    @PostMapping
    public Result add(@RequestBody User user){
        log.info("新增: {}",user);
        service.add(user);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody User user){
        String username = user.getUsername();
        log.info("删除用户名为：{}",username);
        service.delete(username);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody User user){
        log.info("修改用户信息：{}",user);
        service.update(user);
        return Result.success();
    }
}
