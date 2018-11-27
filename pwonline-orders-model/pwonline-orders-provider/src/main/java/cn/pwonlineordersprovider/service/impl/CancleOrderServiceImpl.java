package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单取消实现类
 */
@RestController
public class CancleOrderServiceImpl  {
    @Autowired
    private OrdersDao cancleOrdersDao;
    @RequestMapping(value = "cancleorder",method = RequestMethod.PUT,produces = "text/plain;charset=UTF-8")
    public String cancleOrdersService(String orderid){
        String result = null;
        if (orderid != null) {
            int cancleordersdao = cancleOrdersDao.cancleordersdao(orderid);

            if (cancleordersdao == 1) {
                result = "订单取消成功!";
            }else {
                result = "订单取消失败！";
            }
            System.out.println("订单取消功能：" + result);
        }
        return result;
    }
}
