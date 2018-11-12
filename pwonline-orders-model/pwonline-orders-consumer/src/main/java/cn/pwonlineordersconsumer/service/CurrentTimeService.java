package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.OrderIdCreateBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 获取当前时间接口
 * 为下单时间、取消时间、收货时间、退货时间、退款时间提供服务
 */
@FeignClient(name = "pwonline-orders-provider",fallback = OrderIdCreateBackFactory.class)
public interface CurrentTimeService {
   @RequestMapping(value = "dateProvide", method = RequestMethod.GET)
   public String dateprovide();

}
