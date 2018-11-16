package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.transfer.OrdersTransfer;

import java.util.List;
import java.util.Map;

/**
 * 订单展示模块
 */
public interface OrdersShowService {
    List<OrdersTransfer> getordersshowservice(String personal_id);
}
