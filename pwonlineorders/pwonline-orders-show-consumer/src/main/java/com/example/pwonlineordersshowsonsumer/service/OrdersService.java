package com.example.pwonlineordersshowsonsumer.service;


import com.example.pwonlineordersshowsonsumer.hystrix.BackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2018-11-03 14:22:39
 */
@FeignClient(name = "pwonline-orders-show-provider",fallback = BackService.class)
public interface OrdersService {
    @RequestMapping(value = "/testa",method = RequestMethod.GET)
    public String test();
}