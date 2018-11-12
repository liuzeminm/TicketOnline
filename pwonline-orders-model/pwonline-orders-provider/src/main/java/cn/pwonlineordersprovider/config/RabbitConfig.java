package cn.pwonlineordersprovider.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    //生产者的交换机
    public static final String CONSUME_EXCHANGE = "consume-exchange";


    @Bean
    public TopicExchange directExchange(){
        return new TopicExchange(CONSUME_EXCHANGE,true,false);
    }
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }


}
