package com.xiaocc.service;

import com.xiaocc.pojo.Profession;

import java.util.List;

public interface ProfessionService {
    /**
     * 查询所有专业信息
     * @return
     */
    List<Profession> list();

    /**
     * 新增专业信息
     * @param profession
     */
    void add(Profession profession);
    void delete(String number);
    void update(Profession profession);
}
