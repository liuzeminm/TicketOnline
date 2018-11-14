package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ChangeOrdersStatusBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "pwonline-orders-consumer",fallback = ChangeOrdersStatusBackService.class)
public interface ChangeOrdersStatusService {
    @RequestMapping(value = "changeordersstatus",method = RequestMethod.PUT)
    String changeordersstaus(int orderstateid,String order_id);
}
