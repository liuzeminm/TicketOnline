package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.CancleOrderService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单取消实现类
 */
@Service
public class CancleOrderServiceImpl implements CancleOrderService {
    @Autowired
    private OrdersDao cancleOrdersDao;
    @Override
    public String cancleOrdersService(String orderid){
        int cancleordersdao = cancleOrdersDao.cancleordersdao(orderid);
        System.out.println(cancleordersdao);
        return JSON.toJSONString(cancleordersdao);
    }
}
