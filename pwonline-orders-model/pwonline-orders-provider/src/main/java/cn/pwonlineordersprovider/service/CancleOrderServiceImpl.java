package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.dao.CancleOrdersDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单取消实现类
 */
@RestController
public class CancleOrderServiceImpl {
    @Autowired
    private CancleOrdersDao cancleOrdersDao;
    @RequestMapping(value = "cancleorder",method = RequestMethod.PUT)
    public String cancleOrdersService(String orderid){
        int cancleordersdao = cancleOrdersDao.cancleordersdao(orderid);
        System.out.println(cancleordersdao);
        return JSON.toJSONString(cancleordersdao);
    }
}
