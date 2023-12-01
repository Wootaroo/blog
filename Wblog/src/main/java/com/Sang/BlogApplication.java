package com.Sang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@MapperScan("com.Sang.domain.mapper")

public class BlogApplication {
    public static void main(String[] args){
        SpringApplication.run(BlogApplication.class,args);

    }
}
