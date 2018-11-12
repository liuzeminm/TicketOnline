package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.service.CreateOrdersService;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    private CreateOrdersService createOrdersService;
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    public String createOrders(Orders orders){
        String createservice = createOrdersService.createservice(orders);
        return JSON.toJSONString(createservice);
    }
}
