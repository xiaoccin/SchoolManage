package com.xiaocc.pojo;

import lombok.Data;

import java.sql.Date;
@Data
public class DataInf {
    private Integer id;
    private String number;
    private Date startDate;
    private Integer days;
    private String color;
}
