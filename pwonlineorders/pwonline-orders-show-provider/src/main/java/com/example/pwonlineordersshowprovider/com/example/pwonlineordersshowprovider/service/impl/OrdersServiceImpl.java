package com.example.pwonlineordersshowprovider.com.example.pwonlineordersshowprovider.service.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2018-11-03 14:22:39
 */
@RestController
public class OrdersServiceImpl {
    @RequestMapping(value = "/testa",method = RequestMethod.GET)
    public String test(){return "test";}
}