package com.xiaocc.service.impl;

import com.xiaocc.mapper.TeacherMapper;
import com.xiaocc.pojo.Teacher;
import com.xiaocc.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper mapper;

    @Override
    public List<Teacher> list() {
       return mapper.selectAll();
    }

    @Override
    public void add(Teacher teacher) {
        mapper.insert(teacher);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(Teacher teacher) {
        mapper.update(teacher);
    }
}
