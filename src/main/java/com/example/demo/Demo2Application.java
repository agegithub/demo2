package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@Slf4j
@EnableIntegration
@EnableEurekaClient
public class Demo2Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }}

