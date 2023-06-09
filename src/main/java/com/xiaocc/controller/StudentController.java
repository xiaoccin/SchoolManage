package com.xiaocc.controller;

import com.xiaocc.pojo.Result;
import com.xiaocc.pojo.Student;
import com.xiaocc.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService service;
    @GetMapping
    public Result list(){
        log.info("查询所有学生信息");
        List<Student> studentList = service.list();
        return Result.success(studentList);
    }
    @PostMapping
    public Result add(@RequestBody Student student){
        log.info("新增: {}",student);
        service.add(student);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@PathVariable Student student){
        String number = student.getNumber();
        log.info("删除学生身份证号为：{}",number);
        service.delete(number);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody Student student){
        log.info("修改学生数据:{}",student);
        service.update(student);
        return Result.success();
    }
}
