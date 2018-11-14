package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ChangePerStatusBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "pwonline-orders-consumer",fallback = ChangePerStatusBackService.class)
public interface ChangePerStatusService {
    @RequestMapping(value = "changeperstatus",method = RequestMethod.PUT)
    public String changepersstatusservice(String orderid,int perstatusid);
}
