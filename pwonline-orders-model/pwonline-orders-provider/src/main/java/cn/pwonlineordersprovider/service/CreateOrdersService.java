package cn.pwonlineordersprovider.service;

import entity.Orders;

import javax.servlet.http.HttpSession;

/**
 * 创建订单接口
 */
public interface CreateOrdersService {
    String createservice(Orders orders);
}
