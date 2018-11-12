package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.OrdersService;
import org.springframework.stereotype.Component;

@Component
public class OrderBackService implements OrdersService {
    @Override
    public String test() {
        return "wrong";
    }
}
