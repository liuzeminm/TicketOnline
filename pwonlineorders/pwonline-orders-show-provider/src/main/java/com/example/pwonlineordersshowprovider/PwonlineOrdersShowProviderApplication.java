package com.example.pwonlineordersshowprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PwonlineOrdersShowProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwonlineOrdersShowProviderApplication.class, args);
    }
}
