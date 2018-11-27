package cn.pwonlineordersconsumer.service.impl;

import cn.pwonlineordersconsumer.feigin.orders.GetOrderStatusService;
import cn.pwonlineordersconsumer.feigin.orders.GetTicketInventoryService;
import cn.pwonlineordersconsumer.feigin.orders.OrdersShowService;
import cn.pwonlineordersconsumer.service.OrdersShow;
import cn.pwonlineordersconsumer.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.OrdersTransfer;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersShowImpl implements OrdersShow {
    @Autowired
    private OrdersShowService ordersShowService;

    @Autowired
    private GetOrderStatusService getOrderStatusService;

    @Autowired
    private RedisUtil redisUtil;
    /*// 调取票务信息
    @Autowired
    private GetTicketInventoryService getTicketInventoryService;*/
    @Override
    public String ordersshow(String per_id,int index,int pagesize) {
        String getordersshowservice = ordersShowService.getordersshowservice(per_id);
        // JSON反编译获取list<orders>集合
        List<Orders> getall = JSONArray.parseArray(getordersshowservice,Orders.class);
        OrdersTransfer ordersTransfer = new OrdersTransfer();
        List<OrdersTransfer> getAllOrders = new ArrayList<OrdersTransfer>();
        for (Orders o:getall) {
            ordersTransfer.setOrder_id(o.getOrderId());
            ordersTransfer.setOrder_commotity(o.getOrderCommotity());
            // ordersTransfer.setSeat_info(getTicketInventoryService.getticketInventory("555"));
            ordersTransfer.setSeat_info("座位信息");
            // 票务数目
            ordersTransfer.setTickets_num(1);
            ordersTransfer.setOrder_money("订单金额");
            // 订单状态
            ordersTransfer.setOrder_state(getOrderStatusService.getOrderStatus(o.getOrderId()));
            getAllOrders.add(ordersTransfer);
            // 订单列表缓存到redis为具体订单详情提供快速访问的功能
            redisUtil.set(o.getOrderId(),ordersTransfer);
            // 有效时间15分钟
            redisUtil.expire(o.getOrderId(),60*15);
        }
        PageHelper.startPage(index,pagesize);
        List<OrdersTransfer> getOrdershow = getAllOrders;
        PageInfo page = new PageInfo(getOrdershow,pagesize);
        return JSON.toJSONString(page);
    }
}
