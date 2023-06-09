package com.xiaocc.service.impl;

import com.xiaocc.mapper.ProfessionMapper;
import com.xiaocc.pojo.Profession;
import com.xiaocc.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    private ProfessionMapper mapper;

    @Override
    public List<Profession> list() {
        return mapper.list();
    }

    @Override
    public void add(Profession profession) {
        mapper.insert(profession);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(Profession profession) {
        mapper.update(profession);
    }


}
