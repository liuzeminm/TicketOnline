package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import vo.OrderDetailsInfo;
import vo.OrdersTransfer;
import cn.pwonlineordersprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsShowServiceImpl {
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping(value = "orderdetailshow",method = RequestMethod.POST)
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
