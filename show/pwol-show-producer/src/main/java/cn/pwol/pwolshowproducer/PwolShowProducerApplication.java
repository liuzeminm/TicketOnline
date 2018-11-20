package cn.pwol.pwolshowproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.pwol.pwolshowproducer.mapping")
public class PwolShowProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwolShowProducerApplication.class, args);
    }
}
