package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.send.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMQ {
    @Autowired
    private Sender sd;
    @RequestMapping(value = "mqtest",method = RequestMethod.POST)
    public String send(){
        return sd.send();
    }
}
