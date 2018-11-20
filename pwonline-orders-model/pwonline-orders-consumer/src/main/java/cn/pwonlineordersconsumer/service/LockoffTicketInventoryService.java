package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ServerBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  支付失败或者其他因素，锁定库存释放回数据库
 */
@FeignClient(value = "",fallback = ServerBackFactory.class)
public interface LockoffTicketInventoryService {
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String lockoffticketinventory(String seatinfo);
}
