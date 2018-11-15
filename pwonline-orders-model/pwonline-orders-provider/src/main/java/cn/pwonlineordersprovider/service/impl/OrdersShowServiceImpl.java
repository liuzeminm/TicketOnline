package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.OrdersShowService;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 订单列表展示
 */
@Service
public class OrdersShowServiceImpl implements OrdersShowService {
    @Autowired
    private OrdersDao ordersDao;
    @Override
    public List<Map<String, Object>> getordersshowservice(String personal_id) {
        List<Orders> getall = ordersDao.getAll(personal_id);
        List<Map<String, Object>> getspecificinfolist = null;
        Map<String,Object> map = null;
        for (Orders o:getall) {

        }

        return null;
    }
}
