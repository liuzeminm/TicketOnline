package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.vo.OrdersTransfer;

import java.util.List;

/**
 * 订单展示模块
 */
public interface OrdersShowService {
    List<OrdersTransfer> getordersshowservice(String personal_id);
}
