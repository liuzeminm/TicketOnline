package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 修改订单状态
 */
@FeignClient(value = "pwonline-orders-provider")
public interface ChangeOrdersStatusService {
    @RequestMapping(value = "changeordersstaus",method = RequestMethod.PUT)
    String changeordersstaus(@RequestParam("orderstateid") int orderstateid,@RequestParam("order_id") String order_id);
}
