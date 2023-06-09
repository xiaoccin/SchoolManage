package com.xiaocc.service;

import com.xiaocc.pojo.QrCodeInfo;

import javax.servlet.http.HttpServletResponse;

public interface QrCodeService {
    public void createCodeToFile(String content, String filePath);

    public void createCodeToStream(QrCodeInfo content, HttpServletResponse response);

}


