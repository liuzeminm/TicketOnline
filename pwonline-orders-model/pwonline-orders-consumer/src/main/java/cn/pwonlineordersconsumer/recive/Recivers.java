package cn.pwonlineordersconsumer.recive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Recivers {
    @RabbitHandler
    public void recive(String hello){
        System.out.println("Reciver:" + hello);
    }
}
