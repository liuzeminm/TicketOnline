/*
package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersconsumer.controller.PerInfoController;
import cn.pwonlineordersconsumer.controller.TicketInfoController;
import cn.pwonlineordersconsumer.feigin.orders.OrderIdCreateService;
import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.CurrentTimeService;
import cn.pwonlineordersprovider.util.RedisUtil;
import vo.Order_Vo;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

*/
/**
 * 创建订单逻辑实现类
 *//*

@RestController
public class CreateOrdersServiceImpl {
    // 创建订单dao层
    @Autowired
    private OrdersDao ordersDao;
    @RequestMapping(value = "createorder",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String createservice(String httpsessionid,String per_username,Order_Vo order_vo) throws ParseException {
        Orders orders1 = new Orders();
        String result = null;
        int addorders = ordersDao.addorders(orders1);
        if (addorders ==  1){
            result = "订单创建成功！";
        }else {
            result = "订单创建失败！";
        }
        return result;
    }
}
*/
