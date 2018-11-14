package cn.pwol.pwolbackgroundprovider.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DalyConfig {

    //死信队列
    public final static String DEAD_QUERY="dead-query";

    //死信交换机
    public final static String DEAD_EXCHANGE="dead-exchange";

    //死信队列路由键 将删除的消息推送到指定交换机的指定路由键指定的队列中
    public final static String DEAD_KEY="dead-key";

    //用户交换机
    public final static String USER_EXCHANGE="user-exchange";

    //用户队列
    public final static String USER_QUERY="user-query";


    //配置延时队列
    @Bean
    public Queue dalyQuery(){

        Map<String,Object> map= new HashMap<>();
        map.put("x-dead-letter-exchange",USER_EXCHANGE);
        map.put("x-dead-letter-routing-key",DEAD_KEY);
        /**
         * name:队列名字
         * durable：是否持久化
         * exclusive:该消息队列是否只在当前connnection生效 默认是false 在哪里都生效
         * autoDelete:消息消费完了 是否 删除该队列 默认不删
         */
        return new Queue(DEAD_QUERY,true,false,false,map);
    }

    //配置延时交换机
    @Bean
    public DirectExchange dalyExchange(){
        return new DirectExchange(DEAD_EXCHANGE,true,false);
    }

    //延时交换机和延时队列绑定
    @Bean
    public Binding dalyQueryAndExchange(){
        //延时绑定
        return BindingBuilder.bind(dalyQuery()).to(dalyExchange()).with(DEAD_KEY);
    }

    //定义用户队列
    @Bean
    public Queue userQueue(){
        return  new Queue(USER_QUERY,true,false,false);
    }

    //创建用户交换机
    @Bean
    public TopicExchange userExchange(){
        return new TopicExchange(USER_EXCHANGE,true,false);
    }

    //用户队列和用户交换机绑定
    @Bean
    public Binding userBinding(){
        return BindingBuilder.bind(userQueue()).to(userExchange()).with(DEAD_KEY);
    }



}
