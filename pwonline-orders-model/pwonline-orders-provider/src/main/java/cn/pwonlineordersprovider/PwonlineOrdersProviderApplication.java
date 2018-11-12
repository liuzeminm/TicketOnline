package cn.pwonlineordersprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PwonlineOrdersProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwonlineOrdersProviderApplication.class, args);
    }
}
