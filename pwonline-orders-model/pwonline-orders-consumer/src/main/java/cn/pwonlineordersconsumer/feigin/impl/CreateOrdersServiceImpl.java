package cn.pwonlineordersconsumer.feigin.impl;

import cn.pwonlineordersconsumer.feigin.CreateOrdersService;
import cn.pwonlineordersconsumer.feigin.OrderIdCreateService;
import cn.pwonlineordersconsumer.feigin.orders.*;
import cn.pwonlineordersconsumer.util.RedisUtil;
import vo.Order_Vo;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

/**
 * 创建订单逻辑实现类
 */
@Service
public class CreateOrdersServiceImpl implements CreateOrdersService {
    @Autowired
    private CreateOrdersDataService createOrdersDataService;

    // 获取当前时间，该时间为订单生成时间
    @Autowired
    private CurrentTimeService currentTimeService;

    // 获取订单编号
    @Autowired
    private OrderIdCreateService orderIdCreateService;

    // 获取个人相关信息
    //@Autowired
    //private PerInfoController perInfoController;

    // 获取票务相关信息
    //@Autowired
    //private TicketInfoController ticketInfoController;

    // 修改订单状态
    @Autowired
    private ChangeOrdersStatusService changeOrdersStatusService;
    // redis连接池
    @Autowired
    private RedisUtil redisUtil;

    public String createservice(String httpsessionid,String per_username,Order_Vo order_vo) throws ParseException {
        Orders orders1 = new Orders();
        // 判断登录状态
        String result = null;
        if (per_username == null || per_username.equals("")) {
            result = "未登录！";
        } else {
            // 判断库存
            //String getticketinventory = ticketInfoController.getticketinventory(order_vo.getCommodity_info());
            String getticketinventory = "座位未售出";
            if (getticketinventory.equals("座位已售出")) {
                result = "该座位已经售出，无法购买！";
            } else {
                // 获取商家
                String commodity_info = order_vo.getTicket_info();
                orders1.setOrderId(orderIdCreateService.getOrderId(per_username));
                //orders1.setOrderId("464868464648646");
                orders1.setOrderPersonalId(commodity_info);
                orders1.setOrderSellerId("");
                // 订单状态(1,"未支付";2,"已取消";3,"待出货";4,"待收货";5,"已收货";6,"待退款";7,"已退款";8,"未退货";9,"已退货")
                // 新建订单默认为1，未支付状态
                orders1.setOrderStateId(1);
                // 用户状态状态(1,"未支付";2,"已支付";3,"未收款";4,"已收款";5,"未退货";6,"已退货")
                // 新建订单用户状态初始为1,"未支付
                orders1.setOrderPersonalstateId(1);
                // 商家状态(1,"无";2,"未出货";3,"已出货";4,"未退款";5,"已退款";6,"未收货";7,"已收货")
                // 新建订单商家状态初始为1,"无"
                orders1.setOrderSellstateId(1);
                orders1.setOrderCommotity(order_vo.getCommodity_info());
                // 订单创建时间
                orders1.setOrderCreateTime(currentTimeService.dateprovideDate());
                System.out.println(orders1.getOrderPersonalId());
                redisUtil.set(orders1.getOrderId(), orders1);
                // 订单失效时间15分钟
                redisUtil.expire(orders1.getOrderId(),60 * 15);
                System.out.println(redisUtil.get(orders1.getOrderId()));
                // 当前sessionid
               /* String s = httpsessionid;
                redisUtil.set("sessionid",s);*/
                // 持久化到数据库
                result = createOrdersDataService.createorders(orders1);

                // 订单超时 修改订单状态为2，已取消
                if (redisUtil.get(orders1.getOrderId()).equals(null)){
                    String changeordersstaus = changeOrdersStatusService.changeordersstaus(2, orders1.getOrderId());
                    result = changeordersstaus;
                }
            }
        }
        return result;
    }
}
