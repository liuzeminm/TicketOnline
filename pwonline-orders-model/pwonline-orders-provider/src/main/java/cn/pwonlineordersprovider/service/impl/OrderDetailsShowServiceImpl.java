package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.OrderDetailsShowService;
import cn.pwonlineordersprovider.transfer.OrderDetailsInfo;
import cn.pwonlineordersprovider.transfer.OrdersTransfer;
import cn.pwonlineordersprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsShowServiceImpl implements OrderDetailsShowService {
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String orderdetailsshowservice(String orderid) {
        OrdersTransfer o = (OrdersTransfer) redisUtil.get(orderid);
        OrderDetailsInfo orderDetailsInfo = new OrderDetailsInfo();
        orderDetailsInfo.setOrder_id(orderid);
        orderDetailsInfo.setOrder_state(o.getOrder_state());
        orderDetailsInfo.setOrder_money(o.getOrder_money());
        orderDetailsInfo.setTickets_info("票务信息");
        orderDetailsInfo.setSeat_info(o.getSeat_info());
        orderDetailsInfo.setTicket_single_money("单价");
        // 票数量
        orderDetailsInfo.setTickets_num(1);
        orderDetailsInfo.setDiscounts("优惠");
        orderDetailsInfo.setDelvery_info("配送信息");
        orderDetailsInfo.setCreate_time(ordersDao.getOne(orderid).getOrderCreateTime());

        return JSON.toJSONString(orderDetailsInfo);
    }
}
