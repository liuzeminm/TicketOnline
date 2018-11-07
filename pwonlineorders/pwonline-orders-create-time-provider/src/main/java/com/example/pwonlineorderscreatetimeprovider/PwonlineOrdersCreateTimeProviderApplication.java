package com.example.pwonlineorderscreatetimeprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PwonlineOrdersCreateTimeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwonlineOrdersCreateTimeProviderApplication.class, args);
    }
}
