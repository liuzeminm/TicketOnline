package cn.pwol.pwolsearchprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.pwol.pwolsearchprovider.mapping")
@EnableElasticsearchRepositories(basePackages = "cn.pwol.pwolsearchprovider.pojo")
public class PwolSearchProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwolSearchProviderApplication.class, args);
    }
}
