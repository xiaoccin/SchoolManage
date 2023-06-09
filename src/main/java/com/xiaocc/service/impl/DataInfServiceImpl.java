package com.xiaocc.service.impl;

import com.xiaocc.mapper.DataInfMapper;
import com.xiaocc.pojo.DataInf;
import com.xiaocc.service.DataInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataInfServiceImpl implements DataInfService {

    @Autowired
    private DataInfMapper mapper;


    @Override
    public List<DataInf> list() {
        return mapper.list();
    }

    @Override
    public void add(DataInf dataInf) {
        mapper.insert(dataInf);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(DataInf dataInf) {
        mapper.update(dataInf);
    }
}
