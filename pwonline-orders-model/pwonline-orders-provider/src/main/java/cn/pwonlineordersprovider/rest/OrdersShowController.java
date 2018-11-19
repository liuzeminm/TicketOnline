package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.service.OrdersShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 个人详情订单展示
 */
@RestController
@RequestMapping(value = "/orders_show")
public class OrdersShowController {
    @Autowired
    private OrdersShowService ordersShowService;

    /*public String ordersshowcontro(){}*/
}
