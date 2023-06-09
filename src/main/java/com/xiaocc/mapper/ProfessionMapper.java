package com.xiaocc.mapper;

import com.xiaocc.pojo.Profession;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ProfessionMapper {
    /**
     * 查询所有专业信息
     * @return
     */
    @Select("select P_id as id,P_number as number,P_name as name,C_name as collegeName from profession")
    List<Profession> list();

    /**
     * 添加专业
     * @param profession
     */
    @Insert("insert into profession (P_number,P_name,C_name) values (#{number},#{name},#{collegeName});")
    void insert(Profession profession);

    @Delete("delete from profession where P_number = #{number};")
    void delete(String number);

    @Update("update profession set P_name = #{name},C_name = #{collegeName},P_number = #{number} where P_name=#{number};")
    void update(Profession profession);
}
