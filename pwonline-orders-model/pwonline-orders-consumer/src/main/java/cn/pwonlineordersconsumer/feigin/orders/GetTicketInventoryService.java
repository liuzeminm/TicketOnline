package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 获取票务库存信息
 */
@FeignClient(value = "pwonline-orders-provider")
public interface GetTicketInventoryService {
    @RequestMapping(value = "getticketinventory",method = RequestMethod.POST)
    String getticketInventory(String ticketinfo, String ticketseat);
}
