package cn.pwonlineordersconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderStatusContro {
    @Autowired
    private OrderStateService orderStateService;
    @RequestMapping(value = "orderStatusConsumer",method = RequestMethod.POST)
    public String show(@RequestParam("id")int id){
        return orderStateService.show(id);
    }
}
