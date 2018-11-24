package cn.pwonlineordersconsumer.feigin.orders;

import entity.Orders;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "pwonline-orders-provider")
public interface CreateOrdersDataService {
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    public String createorders(Orders orders);
}
