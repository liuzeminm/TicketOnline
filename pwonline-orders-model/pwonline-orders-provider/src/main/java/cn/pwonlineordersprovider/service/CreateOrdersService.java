package cn.pwonlineordersprovider.service;

import entity.Orders;

import javax.servlet.http.HttpSession;

public interface CreateOrdersService {
    String createservice(Orders orders);
}
