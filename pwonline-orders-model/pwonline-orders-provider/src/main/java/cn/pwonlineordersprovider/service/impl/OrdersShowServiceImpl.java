package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrderStatusDao;
import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.OrdersShowService;
import cn.pwonlineordersprovider.vo.OrdersTransfer;
import cn.pwonlineordersprovider.util.RedisUtil;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单列表展示
 */
@Service
public class OrdersShowServiceImpl implements OrdersShowService {
    // 获取订单信息
    @Autowired
    private OrdersDao ordersDao;
    // 获取订单状态信息
    @Autowired
    private OrderStatusDao orderStatusDao;
    // 获取商品信息



    // redis缓存
    private RedisUtil redisUtil;
    @Override
    public List<OrdersTransfer> getordersshowservice(String personal_id) {
        List<Orders> getall = ordersDao.getAll(personal_id);
        OrdersTransfer ordersTransfer = new OrdersTransfer();
        List<OrdersTransfer> getallorders = new ArrayList<OrdersTransfer>();
        for (Orders o:getall) {
            ordersTransfer.setOrder_id(o.getOrderId());
            ordersTransfer.setOrder_commotity(o.getOrderCommotity());
            ordersTransfer.setSeat_info("座位信息");
            // 票务数目
            ordersTransfer.setTickets_num(1);
            ordersTransfer.setOrder_money("订单金额");
            // 订单状态
            ordersTransfer.setOrder_state(orderStatusDao.getorderstate(o.getOrderStateId()).getStateType());
            getallorders.add(ordersTransfer);
            redisUtil.set(o.getOrderId(),ordersTransfer);
        }
        return getallorders;
    }
}
