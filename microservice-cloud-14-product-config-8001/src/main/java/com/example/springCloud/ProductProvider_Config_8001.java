package com.example.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient //將此服務註冊到Eureka 服務註冊中心
@MapperScan("com.example.springCloud.mapper")
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class, args);
    } }