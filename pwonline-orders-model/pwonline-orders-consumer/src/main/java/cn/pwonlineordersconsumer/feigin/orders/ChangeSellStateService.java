package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 修改商家状态
 */
@FeignClient(value = "pwonline-orders-provider")
public interface ChangeSellStateService {
    @RequestMapping(value = "changesellstatus",method = RequestMethod.PUT)
    public String changesellstateservice(String orderid, String sellid);
}
