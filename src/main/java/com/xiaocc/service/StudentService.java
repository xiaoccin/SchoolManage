package com.xiaocc.service;

import com.xiaocc.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生信息
     * @return
     */
    List<Student> list();

    /**
     * 新增学生信息
     * @param student
     */
    void add(Student student);
    void delete(String number);

    void update(Student student);
}
