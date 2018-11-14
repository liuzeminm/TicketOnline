package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.ChangeSellStateService;
import org.springframework.stereotype.Component;

@Component
public class ChangeSellStateBackService implements ChangeSellStateService {
    @Override
    public String changesellstateservice(String orderid, String sellid) {
        return "商家状态修改异常！";
    }
}
