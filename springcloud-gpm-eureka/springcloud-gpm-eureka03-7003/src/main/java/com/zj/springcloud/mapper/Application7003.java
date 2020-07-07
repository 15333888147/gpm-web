package com.zj.springcloud.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zj
 * @Date: 2020/7/6
 */
@SpringBootApplication
@EnableEurekaServer
public class Application7003 {

    public static void main(String[] args) {
        SpringApplication.run(Application7003.class,args);
    }

}
