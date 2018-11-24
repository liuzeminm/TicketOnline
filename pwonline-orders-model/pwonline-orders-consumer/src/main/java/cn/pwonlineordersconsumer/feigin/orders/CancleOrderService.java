package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 取消订单
 */
@FeignClient(value = "pwonline-orders-provider")
public interface CancleOrderService {
    @RequestMapping(value = "cancleorder",method = RequestMethod.PUT)
    public String cancleOrdersService(String orderid);
}
