package cn.pwonlineordersprovider.service;

import java.util.List;
import java.util.Map;

/**
 * 订单展示模块
 */
public interface OrdersShowService {
    List<Map<String,Object>> getordersshowservice(String personal_id);
}
