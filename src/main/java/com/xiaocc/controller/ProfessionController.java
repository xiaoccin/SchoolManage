package com.xiaocc.controller;

import com.xiaocc.pojo.Klass;
import com.xiaocc.pojo.Profession;
import com.xiaocc.pojo.Result;
import com.xiaocc.service.KlassService;
import com.xiaocc.service.ProfessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/profession")
public class ProfessionController {
    @Autowired
    private ProfessionService service;

    @GetMapping
    public Result list(){
        log.info("查询所有专业的信息");
        List<Profession> klassList = service.list();
        return Result.success(klassList);
    }
    @PostMapping
    public Result add(@RequestBody Profession profession){
        log.info("新增:{}" ,profession);
        service.add(profession);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody Profession profession){
        String number = profession.getNumber();
        log.info("删除专业代号为：{}",number);
        service.delete(number);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/update")
    public Result update(@RequestBody Profession profession){
        log.info("修改专业数据:{}",profession);
        service.update(profession);
        return Result.success();
    }
}

