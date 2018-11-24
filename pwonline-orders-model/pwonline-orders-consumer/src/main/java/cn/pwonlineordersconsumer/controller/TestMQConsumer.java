package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.recive.Recivers;
import cn.pwonlineordersconsumer.feigin.Testmq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestMQConsumer {

    @Autowired
    private Recivers reciver;
    @Autowired
    private Testmq tq;
    @RequestMapping(value = "recive",method = RequestMethod.POST)
    public String recive(String hellow){
        String send = tq.send();
        reciver.recive(hellow);
        return send;
    }
}
