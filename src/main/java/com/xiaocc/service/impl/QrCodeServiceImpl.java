package com.xiaocc.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeException;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.xiaocc.pojo.QrCodeInfo;
import com.xiaocc.service.QrCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
@Service
@Slf4j
public class QrCodeServiceImpl implements QrCodeService {
    @Autowired
    private QrConfig config;

    //生成到文件
    public void createCodeToFile(String content, String filePath) {
        try {

            QrCodeUtil.generate(content,config, FileUtil.file(filePath));
        } catch (QrCodeException e) {
            e.printStackTrace();
        }
    }
    //生成到流
    public void createCodeToStream(QrCodeInfo qrCodeInfo, HttpServletResponse response) {
        try {
            String content;
            log.info(String.valueOf(qrCodeInfo));
            if (qrCodeInfo.getIsDefinite().equals("true")){
                config.setForeColor(Color.RED.getRGB());
            }else if(qrCodeInfo.getIsAborad().equals("true")|| qrCodeInfo.getIsHealth().length>0){
                config.setForeColor(Color.YELLOW.getRGB());
            }else{
                config.setForeColor(Color.GREEN.getRGB());
            }
            content = qrCodeInfo.getName()+qrCodeInfo.getNumber()+qrCodeInfo.getSchoolNumber();
            QrCodeUtil.generate(content,config, "png", response.getOutputStream());
        } catch (QrCodeException | IOException e) {
            e.printStackTrace();
        }
    }


}
