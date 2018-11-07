package com.example.pwonlineordersshowsonsumer.hystrix;

import com.example.pwonlineordersshowsonsumer.service.OrdersService;
import org.springframework.stereotype.Component;

@Component
public class BackService implements OrdersService {
    @Override
    public String test() {
        return "wrong";
    }
}
