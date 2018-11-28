package cn.pwol.pwolshowproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("cn.pwol.pwolshowproducer.mapping")
@EnableDiscoveryClient
public class PwolShowProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwolShowProducerApplication.class, args);
    }
}
