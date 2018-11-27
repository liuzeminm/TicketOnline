package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrderStatusDao;
import cn.pwonlineordersprovider.dao.OrdersDao;
import com.alibaba.fastjson.JSON;
import vo.OrdersTransfer;
import cn.pwonlineordersprovider.util.RedisUtil;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单列表展示
 */
@RestController
public class OrdersShowServiceImpl {
    // 获取订单信息
    @Autowired
    private OrdersDao ordersDao;
    // 获取订单状态信息
    @Autowired
    private OrderStatusDao orderStatusDao;
    // 获取商品信息



    // redis缓存
    private RedisUtil redisUtil;
    @RequestMapping(value = "getordersshow",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String getordersshowservice(String personal_id) {
        List<Orders> getall = ordersDao.getAll(personal_id);
        /*OrdersTransfer ordersTransfer = new OrdersTransfer();
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
            // 订单列表缓存到redis为具体订单详情提供快速访问的功能
            redisUtil.set(o.getOrderId(),ordersTransfer);
            // 有效时间15分钟
            redisUtil.expire(o.getOrderId(),60*15);
        }*/
        return JSON.toJSONString(getall);
    }
}
