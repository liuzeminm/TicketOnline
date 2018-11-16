package cn.pwonlinepaymentprovider.util;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    static final String QUEUE_SECKILL_PAY = "Queue_Seckill_pay";//发送支付队列
    static final String QUEUE_SECKILL_REFUND = "Queue_Seckill_refund";//发送退款队列
    @Bean
    public Queue seckillOrderQueue(){
        return new Queue(QUEUE_SECKILL_PAY);
    }

}
