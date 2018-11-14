package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ChangeSellStateBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(value = "pwonline-orders-consumer",fallback = ChangeSellStateBackService.class)
public interface ChangeSellStateService {
    @RequestMapping(value = "changesellstate",method = RequestMethod.PUT)
    public String changesellstateservice(String orderid,String sellid);
}
