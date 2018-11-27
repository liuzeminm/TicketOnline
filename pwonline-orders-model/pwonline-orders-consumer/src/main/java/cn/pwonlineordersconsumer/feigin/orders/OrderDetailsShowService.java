package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单详情展示
 */
@FeignClient(value = "pwonline-orders-provider")
public interface OrderDetailsShowService {
    @RequestMapping(value = "orderdetailshow",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    String orderdetailsshowservice(String orderid);
}
