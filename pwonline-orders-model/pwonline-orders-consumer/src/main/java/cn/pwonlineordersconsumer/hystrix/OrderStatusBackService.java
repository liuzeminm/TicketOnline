package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.OrderStateService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class OrderStatusBackService implements OrderStateService {
    @Override
    public String show(@RequestParam("id")int id) {
        return "404";
    }
}
