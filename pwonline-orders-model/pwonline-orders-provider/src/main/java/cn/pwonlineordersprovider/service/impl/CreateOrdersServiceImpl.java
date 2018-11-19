package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.CreateOrdersService;
import cn.pwonlineordersprovider.service.CurrentTimeService;
import cn.pwonlineordersprovider.service.OrderIdCreateService;
import cn.pwonlineordersprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建订单逻辑实现类
 */
@Service
public class CreateOrdersServiceImpl implements CreateOrdersService {
    // 创建订单dao层
    @Autowired
    private OrdersDao ordersDao;

    // 获取当前时间，该时间为订单生成时间
    @Autowired
    private CurrentTimeService currentTimeService;

    // 获取订单编号
    @Autowired
    private OrderIdCreateService orderIdCreateService;

    // redis连接池
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String createservice(String per_username,Orders orders) {
        // 判断登录状态
        String result = null;
        if (per_username == "" || per_username.equals("")) {
            result = JSON.toJSONString("未登录！");
        } else {



            // 判断库存

            // 获取商家
            // 订单创建时间
            String orderstarttime = currentTimeService.dateprovideDate();
            Map<String, Orders> ordersMap = new HashMap<String, Orders>();
            // 获取订单信息
            Orders orders1 = new Orders();

            // 判断Session是否过期

            // 订单取消
            if (orders.getOrderStateId() == 2) {

            }
            int addorders = ordersDao.addorders(orders);

            if (addorders == 1) {
                redisUtil.set(orders.getOrderId(), JSON.toJSON(orders), 1000 * 60 * 15);
                System.out.println(redisUtil.get(orders.getOrderId()));
                result = "创建成功！";
            } else {
                result = "创建失败！";
            }
        }
        return result;
    }
}
