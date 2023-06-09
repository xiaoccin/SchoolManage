package com.xiaocc.mapper;


import com.xiaocc.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    @Select("select * from manage ")
    List<User> list();

    /**
     * 登录查询，用户名与密码是否存在且匹配
     * @param username
     * @param password
     * @return
     */
    @Select("select * from manage where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password") String password);

    @Insert("insert into manage (username,password) values (#{username},#{password});")
    void insert(User user);

    @Delete("delete from manage where username=#{username};")
    void delete(String username);

    @Update("update manage set username = #{username},password = #{password} where username=#{username};")
    void update(User user);
}
