package com.ljp.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LjpEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LjpEurekaApplication.class, args);
        System.out.print("++++++++++++++++++++++++eureka服务端 注册中心启动成功！！++++++++++++++++++++++++");

    }
}
