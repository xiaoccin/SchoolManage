package com.xiaocc.service;

import com.xiaocc.pojo.College;
import java.util.List;

public interface CollegeService {
    /**
     * 查询所有学院信息
     * @return
     */
    List<College> list();

    /**
     * 新增学院信息
     * @param college
     */
    void add(College college);

    void delete(String number);

    void update(College college);
}
