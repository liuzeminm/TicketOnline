package cn.pwonlineordersconsumer.service;

import vo.Order_Vo;

import java.text.ParseException;

/**
 * 创建订单接口
 */

public interface CreateOrdersService {
    String createservice(String httpsessionid, String per_username, Order_Vo order_vo) throws ParseException;
}
