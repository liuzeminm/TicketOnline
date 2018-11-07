package com.example.pwonlineordersstatusconsumer.service;

import com.example.pwonlineordersstatusconsumer.hytrix.StatusBackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pwonline-orders-status-provider",fallback = StatusBackService.class)
public interface OrderStateService {
    @RequestMapping(value = "ordersStatusProvider",method = RequestMethod.POST)
    public String show(@RequestParam("id")int id);
}
