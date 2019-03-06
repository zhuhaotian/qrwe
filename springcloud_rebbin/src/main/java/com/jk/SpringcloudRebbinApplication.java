package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudRebbinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRebbinApplication.class, args);
    }

}
