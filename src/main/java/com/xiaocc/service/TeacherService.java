package com.xiaocc.service;


import com.xiaocc.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 查询所有教师信息
     * @return
     */
    List<Teacher> list();

    /**
     * 新增教师信息
     * @param teacher
     */
    void add(Teacher teacher);
    void delete(String number);

    void update(Teacher teacher);
}
