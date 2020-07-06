package com.zj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zj
 * @Date: 2020/7/6
 */
@SpringBootApplication
@EnableEurekaServer
public class Application7002 {

    public static void main(String[] args) {
        SpringApplication.run(Application7002.class,args);
    }

}
