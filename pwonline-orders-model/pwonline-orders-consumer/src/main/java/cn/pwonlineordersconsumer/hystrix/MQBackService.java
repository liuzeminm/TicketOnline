package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.service.Testmq;
import org.springframework.stereotype.Component;

@Component
public class MQBackService implements Testmq {
    @Override
    public String send() {
        return "信息接收失败！";
    }
}
