package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrderStateDao;
import cn.pwonlineordersprovider.dao.OrderStatusDao;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.OrderState.*;
import static enu.OrderState.OR_DONE_RETURN_GOODS;

/**
 * 订单状态查询
 */
@RestController
public class GetOrderStatusServiceImpl {
    @Autowired
    private OrderStatusDao orderStatusDao;


    @RequestMapping(value = "getOrderStatus",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String getOrderStatus(String order_id){
        Orders order = orderStatusDao.getorderstate(order_id);
        Integer orderState = order.getOrderStateId();
        String result = null;
        switch (orderState){
            case 1:
                result = OR_NO_CHARGE.getOrderstatetype();
                break;
            case 2:
                result = OR_CANCLE.getOrderstatetype();
                break;
            case 3:
                result = OR_NO_OUTGO.getOrderstatetype();
                break;
            case 4:
                result = OR_NO_RECIVE.getOrderstatetype();
                break;
            case 5:
                result = OR_DONE_RECIVE.getOrderstatetype();
                break;
            case 6:
                result = OR_NO_REFUND.getOrderstatetype();
                break;
            case 7:
                result = OR_DONE_REFUND.getOrderstatetype();
                break;
            case 8:
                result = OR_NO_RETURN_GOODS.getOrderstatetype();
                break;
            case 9:
                result = OR_DONE_RETURN_GOODS.getOrderstatetype();
                break;
            default:
                result = "订单状态查询异常！";
        }
        return result;
    }
}

