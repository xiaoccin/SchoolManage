package com.xiaocc.service;

import com.xiaocc.pojo.Klass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KlassService {
    /**
     * 查询所有班级信息
     * @return
     */
    List<Klass> list();

    /**
     * 新增班级信息
     * @param klass
     */
    void add(Klass klass);
    void delete(String number);
    void update(Klass klass);
}
