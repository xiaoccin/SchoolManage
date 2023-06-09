package com.xiaocc.controller;

import com.xiaocc.pojo.College;
import com.xiaocc.pojo.Result;
import com.xiaocc.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService service;
    @GetMapping
    public Result list(){
        log.info("查询所有学院信息");
        List<College> collegeList= service.list();
        return Result.success(collegeList);
    }
    @PostMapping
    public Result add(@RequestBody College college){
        log.info("新增学院：{}",college);
        service.add(college);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody College college){
        String number = college.getNumber();
        log.info("删除学院代号为：{}",number);
        service.delete(number);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody College college){
        log.info("修改学院代号为：{}",college);
        service.update(college);
        return Result.success();
    }
}
