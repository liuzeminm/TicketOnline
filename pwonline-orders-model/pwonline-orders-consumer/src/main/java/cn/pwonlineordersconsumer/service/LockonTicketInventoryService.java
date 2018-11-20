package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ServerBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单库存锁定
 */
@FeignClient(value = "",fallback = ServerBackFactory.class)
public interface LockonTicketInventoryService {
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String lockonticketinventory(String seatinfo);
}
