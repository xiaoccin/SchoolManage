package com.xiaocc.mapper;

import com.xiaocc.pojo.Klass;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface KlassMapper {
    /**
     * 查询所有班级
     * @return
     */
    @Select("select Cl_id as id,Cl_number as number,Cl_name as name,P_name as professionName  from classes")
    List<Klass> list();

    /**
     * 添加班级
     * @param klass
     */
    @Insert("insert into classes (Cl_number,Cl_name,P_name) values (#{number},#{name},#{professionName});")
    void insert(Klass klass);

    @Delete("delete from classes where Cl_number = #{number};")
    void delete(String number);

    @Update("update classes set P_name = #{professionName},Cl_name=#{name},Cl_number=#{number} where Cl_number=#{number};")
    void update(Klass klass);
}
