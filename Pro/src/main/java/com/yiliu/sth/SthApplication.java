package com.yiliu.sth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 *
 *
 */
@MapperScan("com.yiliu.sth.dao")
@SpringBootApplication
@EnableCaching
public class SthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SthApplication.class, args);
    }

}
