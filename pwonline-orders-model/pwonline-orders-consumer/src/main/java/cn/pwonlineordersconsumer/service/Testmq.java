package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.MQBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "pwonline-orders-provider",fallback = MQBackService.class)
public interface Testmq {
    @RequestMapping(value = "mqtest",method = RequestMethod.POST)
    public String send();
}
