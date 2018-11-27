package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vo.OrdersTransfer;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

/**
 * 订单展示模块
 */
@FeignClient(value = "pwonline-orders-provider")
public interface OrdersShowService {
    @RequestMapping(value = "getordersshow",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String getordersshowservice(String personal_id);
}
