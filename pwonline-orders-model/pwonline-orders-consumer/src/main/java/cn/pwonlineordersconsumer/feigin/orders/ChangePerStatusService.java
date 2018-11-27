package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 修改个人状态
 */
@FeignClient(value = "pwonline-orders-provider")
public interface ChangePerStatusService {
    @RequestMapping(value = "changeperstatus",method = RequestMethod.PUT,produces = "text/plain;charset=UTF-8")
    public String changepersstatusservice(@RequestParam("orderid")String orderid,@RequestParam("perstatusid") int perstatusid);
}
