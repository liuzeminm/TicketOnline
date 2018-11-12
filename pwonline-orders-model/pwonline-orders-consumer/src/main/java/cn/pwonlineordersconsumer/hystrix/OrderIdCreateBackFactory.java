package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.CurrentTimeService;
import org.springframework.stereotype.Component;

@Component
public class OrderIdCreateBackFactory implements CurrentTimeService {

    @Override
    public String dateprovide() {
        return "404";
    }
}
