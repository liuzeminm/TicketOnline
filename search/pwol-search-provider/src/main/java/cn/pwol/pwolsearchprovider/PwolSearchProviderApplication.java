package cn.pwol.pwolsearchprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PwolSearchProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwolSearchProviderApplication.class, args);
    }
}
