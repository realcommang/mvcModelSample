package com.example.toy_project;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("your.package.name")
public class ToyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToyProjectApplication.class, args);
    }

}
