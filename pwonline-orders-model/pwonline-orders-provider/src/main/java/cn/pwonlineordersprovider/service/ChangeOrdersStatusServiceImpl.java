package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.dao.ChangeOrdersStatusDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.OrderState.*;

@RestController
public class ChangeOrdersStatusServiceImpl {
    @Autowired
    private ChangeOrdersStatusDao changeOrdersStatusDao;
    @RequestMapping(value = "changeordersstatus",method = RequestMethod.PUT)
    String changeordersstaus(int orderstateid,String order_id){
        String result = null;
        int changeordersstatusdao = changeOrdersStatusDao.changeordersstatusdao(orderstateid, order_id);
        if (changeordersstatusdao == 1){
            if (orderstateid == OR_CANCLE.getOrderstateid()){
                // 订单已取消
                result = "订单状态为:"+ OR_CANCLE.getOrderstatetype();
            }else if (orderstateid == OR_NO_OUTGO.getOrderstateid()){
                // 订单待出货
                result = "订单状态为:"+ OR_NO_OUTGO.getOrderstatetype();
            }else if (orderstateid == OR_NO_RECIVE.getOrderstateid()){
                // 订单待收货
                result = "订单状态为:"+ OR_NO_RECIVE.getOrderstatetype();
            }else if (orderstateid == OR_DONE_RECIVE.getOrderstateid()){
                // 订单已收货
                result = "订单状态为:"+ OR_DONE_RECIVE.getOrderstatetype();
            }else if (orderstateid == OR_NO_REFUND.getOrderstateid()){
                // 订单待退款
                result = "订单状态为:"+ OR_NO_REFUND.getOrderstatetype();
            }else if (orderstateid == OR_DONE_REFUND.getOrderstateid()){
                // 订单已退款
                result = "订单状态为:"+ OR_DONE_REFUND.getOrderstatetype();
            }else if (orderstateid == OR_NO_RETURN_GOODS.getOrderstateid()){
                // 订单待退货
                result = "订单状态为:"+ OR_NO_RETURN_GOODS.getOrderstatetype();
            }else if (orderstateid == OR_DONE_RETURN_GOODS.getOrderstateid()){
                // 订单已退货
                result = "订单状态为:"+ OR_DONE_RETURN_GOODS.getOrderstatetype();
            }else if (orderstateid > 9 || orderstateid <= 1){
                result = "订单状态修改失败";
            }
        }else {
            result = "订单修改失败！";
        }
        return result;
    }
}
