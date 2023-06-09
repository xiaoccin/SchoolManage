package com.xiaocc.mapper;

import com.xiaocc.pojo.DataInf;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DataInfMapper {
    /**
     * 查询所有打卡信息
     * @return
     */
    @Select("select id,number,start_date as startDate,days,color from datainformation")
    List<DataInf> list();


    /**
     * 添加打卡信息
     * @param dataInf
     */
    @Insert("insert into datainformation (number,start_date,days,color) values (#{number},#{startDate},#{days},#{color});")
    void insert(DataInf dataInf);

    @Delete("delete from datainformation where number=#{number};")
    void delete(String number);
    
    @Update("update datainformation set color = #{color},days =#{days},number=#{number},start_date=#{startDate} where number=#{number};")
    void update(DataInf dataInf);
}
