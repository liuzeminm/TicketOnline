package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.CancleOrdersBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单取消接口
 */
@FeignClient(name = "pwonline-orders-provider",fallback = CancleOrdersBackService.class)
public interface CancleOrderService {
    @RequestMapping(value = "cancleorder",method = RequestMethod.PUT)
    public String cancleOrdersService(String orderid);
}
