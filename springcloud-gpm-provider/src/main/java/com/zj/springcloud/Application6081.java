package com.zj.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zj.springcloud.mapper")
public class Application6081 {

    public static void main(String[] args) {
        SpringApplication.run(Application6081.class,args);
    }

}
