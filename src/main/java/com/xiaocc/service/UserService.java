package com.xiaocc.service;

import com.xiaocc.pojo.User;
import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> list();

    /**
     * 新增用户信息
     * @param user
     */
    void add(User user);
    void delete(String username);

    void update(User user);

    User login(User user);
}
