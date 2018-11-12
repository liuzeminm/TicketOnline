package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.service.OrderIdCreateService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderIdCreateContro {
    @Autowired
    private OrderIdCreateService orderIdCreateService;
    @RequestMapping(value = "createorderid",method = RequestMethod.POST)
    public String getOrderid(){
        String orderId = orderIdCreateService.getOrderId();
        System.out.println(orderId);
        return JSON.toJSONString(orderId);
    }
}
