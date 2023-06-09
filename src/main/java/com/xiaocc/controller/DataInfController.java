package com.xiaocc.controller;

import com.xiaocc.pojo.DataInf;
import com.xiaocc.pojo.Result;
import com.xiaocc.service.DataInfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/dataInf")
public class DataInfController {
    @Autowired
    private DataInfService service;


    @GetMapping
    public Result list(){
        log.info("查询所有打卡信息");
        List<DataInf> dataInfList = service.list();
        return Result.success(dataInfList);
    }
    @PostMapping
    public Result add(@RequestBody DataInf dataInf){
        log.info("新增:{}",dataInf);
        service.add(dataInf);
        return Result.success();
    }
    @CrossOrigin
    @PutMapping("/delete")
    public Result delete(@RequestBody DataInf dataInf){
        String number = dataInf.getNumber();
        log.info("删除打卡信息为：{}",number);
        service.delete(number);
        return Result.success();
    }

    @CrossOrigin
    @PutMapping("/update")
    public Result update(@RequestBody DataInf dataInf){
        log.info("修改打卡信息:{}",dataInf);
        service.update(dataInf);
        return Result.success();
    }
}
