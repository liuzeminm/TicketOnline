package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.ChangeOrdersStatusService;
import org.springframework.stereotype.Component;

@Component
public class ChangeOrdersStatusBackService implements ChangeOrdersStatusService {
    @Override
    public String changeordersstaus(int orderstateid, String order_id) {
        return "订单状态修改失败";
    }
}
