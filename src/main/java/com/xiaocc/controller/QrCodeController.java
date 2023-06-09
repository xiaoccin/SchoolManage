package com.xiaocc.controller;

import com.xiaocc.pojo.QrCodeInfo;
import com.xiaocc.pojo.Result;
import com.xiaocc.service.QrCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/qrcode")
public class QrCodeController {
    @Autowired
    private QrCodeService service;
    //生成二维码并将其返回给前端调用者_hutool
    @PostMapping("generate/v3")
    public Result generateV3(@RequestBody QrCodeInfo content, HttpServletResponse servletResponse){
        Result response = null;
        try {
            //将生成的二维码文件存放于文件目录中
            //final String fileName=LOCALDATEFORMAT.get().format(new Date());
            //codeService.createCodeToFile(content,RootPath+File.separator+fileName+".png");

            //将生成的二维码文件直接返回给前端响应流
           service.createCodeToStream(content,servletResponse);
        }catch (Exception e){
            response = Result.error(e.getMessage());
        }
        return response;
    }
}
