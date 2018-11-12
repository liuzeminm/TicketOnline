package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.CreateOrdersDao;
import cn.pwonlineordersprovider.service.CreateOrdersService;
import cn.pwonlineordersprovider.util.RedisUtil;
import entity.Orders;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建订单逻辑实现类
 */
@Service
public class CreateOrdersServiceImpl implements CreateOrdersService {
    @Autowired
    private CreateOrdersDao createOrdersDao;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String createservice(Orders orders) {
        Map<String,Orders> ordersMap = new HashMap<String,Orders>();
        // 获取订单信息
        Orders orders1 = new Orders();
        // 判断Session是否过期

        // 订单取消
        if (orders.getOrderStateId() == 2){

        }
        int addorders = createOrdersDao.addorders(orders);
        System.out.println(addorders);
        String result = null;
        if (addorders == 1){
            result = "创建成功！";
        }else {
            result = "创建失败！";
        }
        return result;
    }
}
