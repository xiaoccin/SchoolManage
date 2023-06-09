package com.xiaocc.service.impl;

import com.xiaocc.mapper.KlassMapper;
import com.xiaocc.pojo.Klass;
import com.xiaocc.service.KlassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KlassServiceImpl implements KlassService {

    @Autowired
    private KlassMapper mapper;

    @Override
    public List<Klass> list() {
        return mapper.list();
    }

    @Override
    public void add(Klass klass) {
        mapper.insert(klass);
    }

    @Override
    public void delete(String number) {
        mapper.delete(number);
    }

    @Override
    public void update(Klass klass) {
        mapper.update(klass);
    }


}
