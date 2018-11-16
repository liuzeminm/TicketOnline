package cn.pwonlinepaymentprovider.util;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendSeckillPayrQueue(String message) {
        this.amqpTemplate.convertAndSend(RabbitConfig.QUEUE_SECKILL_PAY, message);
    }
    public void sendSeckillRefundQueue(String message) {
        this.amqpTemplate.convertAndSend(RabbitConfig.QUEUE_SECKILL_REFUND, message);
    }
}
