package com.example.pwonlineordersshowsonsumer.controller;

import com.example.pwonlineordersshowsonsumer.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService os;
    @RequestMapping("start")
    public String show(){
        return os.test();
    }
}
