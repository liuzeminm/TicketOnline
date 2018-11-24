package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.PersonalState.*;

@RestController
public class ChangePerStatusServiceImpl {
    @Autowired
    private OrdersDao changePerStatusDao;
    @RequestMapping(value = "changeperstatus",method = RequestMethod.PUT)
    public String changepersstatusservice(String orderid,int perstatusid){
        int i = changePerStatusDao.changePerStatusdao(orderid, perstatusid);
        String result = null;
        if (i == 1){
            switch (perstatusid){
                case 1:
                    result = "个人状态:" + PER_NO_PAY.getStatetype();
                    break;
                case 2:
                    result = "个人状态:" + PER_DONE_PAY.getStatetype();
                    break;
                case 3:
                    result = "个人状态:" + PER_NO_PROCEEDS.getStatetype();
                    break;
                case 4:
                    result = "个人状态:" + PER_DONE_PROCEEDS.getStatetype();
                    break;
                case 5:
                    result = "个人状态:" + PER_NO_RETURN_GOODS.getStatetype();
                    break;
                case 6:
                    result = "个人状态:" + PER_DONE_RETURN_GOODS.getStatetype();
                    break;
                default:
                    result = "个人状态修改异常！";
            }
        }else {
            result = "个人状态修改失败!";
        }
        System.out.println(result);
        return  result;
    }
}
