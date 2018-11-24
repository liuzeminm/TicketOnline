package cn.pwonlineordersconsumer.feigin.orders;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 修改个人状态
 */
@FeignClient(value = "pwonline-orders-provider")
public interface ChangePerStatusService {
    @RequestMapping(value = "changeperstatus",method = RequestMethod.PUT)
    public String changepersstatusservice(String orderid, int perstatusid);
}
