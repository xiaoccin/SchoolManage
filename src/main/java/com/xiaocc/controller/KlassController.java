package com.xiaocc.controller;

import com.xiaocc.pojo.Klass;
import com.xiaocc.pojo.Result;
import com.xiaocc.service.KlassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/klass")
public class KlassController {
    @Qualifier("klassServiceImpl")
    @Autowired
    private KlassService service;
    @GetMapping
    public Result list(){
        log.info("查询所有班级的信息");
        List<Klass> klassList = service.list();
        return Result.success(klassList);
    }

    @PostMapping
    public Result add(@RequestBody Klass klass){
        log.info("新增:{}" ,klass);
        service.add(klass);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody Klass klass){
        String number = klass.getNumber();
        log.info("删除班级代号为：{}",number);
        service.delete(number);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Klass klass){
        log.info("修改班级:{}",klass);
        service.update(klass);
        return Result.success();
    }
}
