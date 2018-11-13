package cn.pwonlineordersprovider.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public String send(String msg){
        msg = "liuzemin";
        String content = msg + new Date();
        System.out.println("Sender:" + content);
        this.amqpTemplate.convertAndSend("hello",content);
        return "Sender:" + content;
    }
}
