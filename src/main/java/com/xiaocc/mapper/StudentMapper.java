package com.xiaocc.mapper;


import com.xiaocc.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 查阅所有数据
     * @return
     */
    @Select("select S_id as id,S_number as number,S_school_number as schoolNumber,S_college as college,S_profession as profession,S_class_name as className,S_name as name from student")
    List<Student> list();

    /**
     * 添加学生
     * @param student
     */
    @Insert("insert into student (S_number,S_school_number,S_college,S_profession,S_class_name,S_name) values (#{number},#{schoolNumber},#{college},#{profession},#{className},#{name});")
    void insert(Student student);

    @Delete("delete from student where S_number=#{number};")
    void delete(String number);

    @Update("update student set S_number = #{number},S_college = #{college},S_name=#{name},S_profession=#{profession} where S_school_number =#{schoolNumber};")
    void update(Student student);
}
