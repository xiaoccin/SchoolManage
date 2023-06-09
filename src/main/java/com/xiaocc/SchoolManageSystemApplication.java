package com.xiaocc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xiaocc.mapper")
public class SchoolManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManageSystemApplication.class, args);
    }

}
