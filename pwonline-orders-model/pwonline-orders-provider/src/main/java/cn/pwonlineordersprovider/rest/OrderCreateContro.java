package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.vo.Order_Vo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 创建订单入口
 */
@RestController
public class OrderCreateContro {


    // 创建订单，获取前台信息
    @RequestMapping(value = "createordercontro",method = RequestMethod.POST)
    public String getOrdersnfo(String per_username, HttpSession httpSession, Order_Vo order_vo){
        // 获取到订单信息，然后传到后台做下一步操作
        String id = httpSession.getId();
        return null;
    }
}
