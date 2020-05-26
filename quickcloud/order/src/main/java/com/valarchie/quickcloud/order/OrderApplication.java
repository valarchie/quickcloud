package com.valarchie.quickcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* description: 订单微服务
* @author: valarchie
* on: 2020/5/26
* @email: 343928303@qq.com
*/
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }


}