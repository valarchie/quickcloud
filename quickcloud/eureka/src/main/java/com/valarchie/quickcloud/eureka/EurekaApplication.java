package com.valarchie.quickcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* description: eureka启动器
* @author: valarchie
* on: 2020/5/26
* @email: 343928303@qq.com
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}