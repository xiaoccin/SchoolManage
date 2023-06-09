package com.xiaocc.controller;

import com.xiaocc.pojo.Result;
import com.xiaocc.pojo.Teacher;
import com.xiaocc.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @GetMapping
    public Result list(){
        log.info("查询所有教师信息");
        List<Teacher> teacherList = service.list();
        return Result.success(teacherList);
    }
    @PostMapping
    public Result add(@RequestBody Teacher teacher){
        log.info("新增: {}",teacher);
        service.add(teacher);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody Teacher teacher ){
        String number = teacher.getNumber();
        log.info("删除身份证号为：{}",number);
        service.delete(number);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody Teacher teacher){
        log.info("修改教师信息:{}",teacher);
        service.update(teacher);
        return Result.success();
    }
}
