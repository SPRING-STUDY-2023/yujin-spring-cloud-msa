package com.example.ecoommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcoommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoommerceApplication.class, args);
    }

}
