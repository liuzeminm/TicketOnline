package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.vo.Order_Vo;

import javax.servlet.http.HttpSession;
import java.text.ParseException;

/**
 * 创建订单接口
 */
public interface CreateOrdersService {
    String createservice(String httpsessionid,String per_username,Order_Vo order_vo) throws ParseException;
}
