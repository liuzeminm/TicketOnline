package cn.pwol.pwolbackgroundprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("cn.pwol.pwolbackgroundprovider.mappin")
@EnableSwagger2
public class PwolBackgroundProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwolBackgroundProviderApplication.class, args);
    }
}
