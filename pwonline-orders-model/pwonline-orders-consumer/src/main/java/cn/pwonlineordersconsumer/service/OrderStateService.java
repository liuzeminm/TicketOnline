package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.OrderStatusBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 获取订单状态接口
 */
@FeignClient(name = "pwonline-orders-status-provider",fallback = OrderStatusBackService.class)
public interface OrderStateService {
    @RequestMapping(value = "ordersStatusProvider",method = RequestMethod.POST)
    public String show(@RequestParam("id") int id);
}
