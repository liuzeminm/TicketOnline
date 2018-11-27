package cn.pwonlineordersconsumer.service.impl;

import cn.pwonlineordersconsumer.feigin.orders.GetOrderStatusService;
import cn.pwonlineordersconsumer.feigin.orders.OrderDetailsShowService;
import cn.pwonlineordersconsumer.feigin.orders.OrdersShowService;
import cn.pwonlineordersconsumer.service.OrderInfoService;
import cn.pwonlineordersconsumer.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.OrderDetailsInfo;
import vo.OrdersTransfer;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderDetailsShowService orderDetailsShowService;

    @Autowired
    private GetOrderStatusService getOrderStatusService;

    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String orderInfo(String orderId) {
        String result = orderDetailsShowService.orderdetailsshowservice(orderId);
        Orders one = JSON.parseObject(result,Orders.class);
        OrderDetailsInfo orderDetailsInfo = new OrderDetailsInfo();
        // Redis非空直接从Redis读取对应数据
        if (redisUtil.get(orderId) != null) {
            OrdersTransfer o = (OrdersTransfer) redisUtil.get(orderId);
            orderDetailsInfo.setOrder_id(orderId);
            orderDetailsInfo.setOrder_state(o.getOrder_state());
            orderDetailsInfo.setOrder_money(o.getOrder_money());
            orderDetailsInfo.setTickets_info("票务信息");
            orderDetailsInfo.setSeat_info(o.getSeat_info());
            orderDetailsInfo.setTicket_single_money("单价");
            // 票数量
            orderDetailsInfo.setTickets_num(1);
            orderDetailsInfo.setDiscounts("优惠");
            orderDetailsInfo.setDelvery_info("配送信息");
            orderDetailsInfo.setCreate_time(one.getOrderCreateTime());
        }else {
            orderDetailsInfo.setOrder_id(orderId);
            orderDetailsInfo.setOrder_state(getOrderStatusService.getOrderStatus(orderId));
            orderDetailsInfo.setOrder_money("金额");
            orderDetailsInfo.setTickets_info("票务信息");
            orderDetailsInfo.setSeat_info("座位信息");
            orderDetailsInfo.setTicket_single_money("单价");
            // 票数量
            orderDetailsInfo.setTickets_num(1);
            orderDetailsInfo.setDiscounts("优惠");
            orderDetailsInfo.setDelvery_info("配送信息");
            orderDetailsInfo.setCreate_time(one.getOrderCreateTime());

        }

        return JSON.toJSONString(orderDetailsInfo);
    }
}
