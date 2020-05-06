package com.mycom.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ：songdalin
 * @date ：2020-05-05 下午 06:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
//开启异步调用
@EnableAsync
public class SpringBootTestApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootTestApplication.class, args);
    }
}
