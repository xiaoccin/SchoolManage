package com.xiaocc.mapper;

import com.xiaocc.pojo.College;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface CollegeMapper {

    /**
     * 查询所有学院
     * @return
     */
    @Select("select C_id as id,C_number as number,C_name as name from college")
    List<College> list();

    /**
     * 新增学院
     * @param college
     */
    @Insert("insert into college(C_number,C_name) values(#{number},#{name})")
    void insert(College college);

    /**
     * 按学院代号删除学院
     * @param number
     */
    @Delete("delete from college where C_number=#{number};")
    void delete(String number);

    @Update("update college set C_name = #{name} where C_number = #{number}; ")
    void update(College college);
}
