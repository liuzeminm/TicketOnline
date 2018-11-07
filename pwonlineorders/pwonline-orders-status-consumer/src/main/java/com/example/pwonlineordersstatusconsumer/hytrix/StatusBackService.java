package com.example.pwonlineordersstatusconsumer.hytrix;

import com.example.pwonlineordersstatusconsumer.service.OrderStateService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class StatusBackService implements OrderStateService {
    @Override
    public String show(@RequestParam("id")int id) {
        return "404";
    }
}
