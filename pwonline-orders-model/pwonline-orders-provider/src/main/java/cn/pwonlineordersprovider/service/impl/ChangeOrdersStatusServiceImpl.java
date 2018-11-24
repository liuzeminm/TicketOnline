package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static enu.OrderState.*;

@RestController
public class ChangeOrdersStatusServiceImpl {
    @Autowired
    private OrdersDao changeOrdersStatusDao;
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping(value = "changeordersstaus",method = RequestMethod.PUT)
    public String changeordersstaus(@RequestParam("orderstateid") int orderstateid, @RequestParam("order_id") String order_id){
        String result = null;
        int changeordersstatusdao = changeOrdersStatusDao.changeordersstatusdao(orderstateid, order_id);
        switch (orderstateid){
            case 2:
                result = "订单状态为:"+ OR_CANCLE.getOrderstatetype();
                break;
            case 3:
                result = "订单状态为:"+ OR_NO_OUTGO.getOrderstatetype();
                break;
            case 4:
                result = "订单状态为:"+ OR_NO_RECIVE.getOrderstatetype();
                break;
            case 5:
                result = "订单状态为:"+ OR_DONE_RECIVE.getOrderstatetype();
                break;
            case 6:
                result = "订单状态为:"+ OR_NO_REFUND.getOrderstatetype();
                break;
            case 7:
                result = "订单状态为:"+ OR_DONE_REFUND.getOrderstatetype();
                break;
            case 8:
                result = "订单状态为:"+ OR_NO_RETURN_GOODS.getOrderstatetype();
                break;
            case 9:
                result = "订单状态为:"+ OR_DONE_RETURN_GOODS.getOrderstatetype();
                break;
            default:
                result = "订单状态修改失败！";
        }
        System.out.println(result);
        return result;
    }
}
