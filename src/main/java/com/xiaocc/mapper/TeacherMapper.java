package com.xiaocc.mapper;

import com.xiaocc.pojo.Teacher;
import com.xiaocc.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    /**
     * 查询所有教师信息
     * @return
     */
    @Select("select T_id as id,T_number as number,T_name as name,T_work_number as workNumber,T_college as college,T_role as role from teacher")
    List<Teacher> selectAll();


    @Insert("insert into teacher (T_number,T_name,T_work_number,T_college,T_role) values (#{number},#{name},#{workNumber},#{college},#{role});")
    void insert(Teacher teacher);

    @Delete("delete from teacher where T_number=#{number};")
    void delete(String number);

    @Update("update teacher set T_number = #{number},T_name = #{name},T_college = #{college},T_role = #{role} where T_work_number=#{workNumber};")
    void update(Teacher teacher);
}
