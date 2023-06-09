package com.xiaocc.service;

import com.xiaocc.pojo.DataInf;

import java.util.List;

public interface DataInfService {
    /**
     * 查询所有打卡信息
     * @return
     */
    List<DataInf> list();

    /**
     * 新增打卡信息
     * @param dataInf
     */
    void add(DataInf dataInf);
    void delete(String number);

    void update(DataInf dataInf);
}
