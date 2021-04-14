package com.foitech.dmp.dmp_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DmpEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmpEurekaServiceApplication.class, args);
    }

}
