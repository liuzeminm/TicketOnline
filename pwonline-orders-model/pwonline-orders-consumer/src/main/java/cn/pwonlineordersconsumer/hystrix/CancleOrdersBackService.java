package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.CancleOrderService;
import org.springframework.stereotype.Component;

@Component
public class CancleOrdersBackService implements CancleOrderService {
    @Override
    public String cancleOrdersService(String orderid) {
        return "订单取消失败！";
    }
}
