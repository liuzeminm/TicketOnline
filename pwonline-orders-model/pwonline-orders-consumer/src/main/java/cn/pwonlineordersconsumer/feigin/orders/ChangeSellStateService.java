package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 修改商家状态
 */
@FeignClient(value = "pwonline-orders-provider")
public interface ChangeSellStateService {
    @RequestMapping(value = "changesellstatus",method = RequestMethod.PUT,produces = "text/plain;charset=UTF-8")
    public String changesellstateservice(@RequestParam("orderid")String orderid,@RequestParam("sellid") String sellid);
}
