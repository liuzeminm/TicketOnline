package cn.pwonlineordersprovider.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitConfig {
    //延时队列
    public static final String DELAY_QUEUE = "consume-delay-queue";

    //延时队列要传输到的交换机 用户交换机
    public static final String USER_EXCHANGE = "consume-order-exchange";

    //真正要用的队列
    public static final String USER_QUEUE = "consume-order-queue";

    //死信队列路由键 将删除的消息推送到指定交换机的指定路由键指定的队列中
    public final static String DEAD_KEY="order";


    @Bean
    public Queue delayQueue(){
        Map<String,Object> map = new HashMap<>();
        map.put("x-dead-letter-exchange",USER_EXCHANGE);
        map.put("x-dead-letter-routing-key",DEAD_KEY);
        map.put("x-message-ttl",1*6*1000);

        return new Queue(DELAY_QUEUE,true,false,false,map);
    }


    @Bean
    public TopicExchange userExchange(){
        return new TopicExchange(USER_EXCHANGE,true,false);
    }


    @Bean
    public Queue orderQueue(){
        return new Queue(USER_QUEUE,true,false,false);
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(orderQueue()).to(userExchange()).with(DEAD_KEY);
    }
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }


}
