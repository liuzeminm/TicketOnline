package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.ChangePerStatusService;
import org.springframework.stereotype.Component;

@Component
public class ChangePerStatusBackService implements ChangePerStatusService {
    @Override
    public String changepersstatusservice(String orderid, int perstatusid) {
        return "个人状态修改异常！";
    }
}
