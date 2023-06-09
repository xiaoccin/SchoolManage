package com.xiaocc.service.impl;

import com.xiaocc.mapper.StudentMapper;
import com.xiaocc.pojo.Student;
import com.xiaocc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> list() {
        return mapper.list();
    }

    @Override
    public void add(Student student) {
        mapper.insert(student);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(Student student) {
        mapper.update(student);
    }


}
