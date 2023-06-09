package com.xiaocc.service.impl;

import com.xiaocc.mapper.UserMapper;
import com.xiaocc.pojo.User;
import com.xiaocc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> list() {
        return mapper.list();
    }

    @Override
    public void add(User user) {
        mapper.insert(user);
    }

    @Override
    public void delete(String username) {
        mapper.delete(username);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }

    @Override
    public User login(User user) {
        return mapper.select(user.getUsername(), user.getPassword());
    }
}
