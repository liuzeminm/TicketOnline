package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateOrdersDataServiceImpl {
    @Autowired
    private OrdersDao ordersDao;
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    public String createorders(Orders orders){
        String result = null;
        if (ordersDao.addorders(orders) == 1){
            result = "订单创建成功！";
        }else {
            result = "订单创建失败！";
        }
        //return JSON.toJSONString(ordersDao.addorders(orders));
        return result;
    }
}
