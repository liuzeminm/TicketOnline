package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "pwonline-orders-provider")
public interface GetOrderStatusService {
    @RequestMapping(value = "getOrderStatus",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String getOrderStatus(String order_id);
}
