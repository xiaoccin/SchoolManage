package com.xiaocc.service.impl;

import com.xiaocc.mapper.CollegeMapper;
import com.xiaocc.pojo.College;
import com.xiaocc.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeMapper mapper;

    @Override
    public List<College> list() {
        return mapper.list();
    }

    @Override
    public void add(College college) {
        mapper.insert(college);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(College college) {
        mapper.update(college);
    }


}
