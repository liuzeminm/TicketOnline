package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.dao.ChangePerStatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.PersonalState.*;

@RestController
public class ChangePerStatusServiceImpl {
    @Autowired
    private ChangePerStatusDao changePerStatusDao;
    @RequestMapping(value = "changeperstatus",method = RequestMethod.PUT)
    public String changepersstatusservice(String orderid,int perstatusid){
        int i = changePerStatusDao.changePerStatusdao(orderid, perstatusid);
        String result = null;
        if (i == 1){
            if (perstatusid == PER_NO_PAY.getStateid()){
                result = "个人状态:" + PER_NO_PAY.getStatetype();
            }else if (perstatusid == PER_DONE_PAY.getStateid()){
                result = "个人状态:" + PER_DONE_PAY.getStatetype();
            }else if (perstatusid == PER_NO_PROCEEDS.getStateid()){
                result = "个人状态:" + PER_NO_PROCEEDS.getStatetype();
            }else if (perstatusid == PER_DONE_PROCEEDS.getStateid()){
                result = "个人状态:" + PER_DONE_PROCEEDS.getStatetype();
            }else if (perstatusid == PER_NO_RETURN_GOODS.getStateid()){
                result = "个人状态:" + PER_NO_RETURN_GOODS.getStatetype();
            }else if (perstatusid == PER_DONE_RETURN_GOODS.getStateid()){
                result = "个人状态:" + PER_DONE_RETURN_GOODS.getStatetype();
            }else {
                result = "个人状态异常";
            }
        }else {
            result = "个人状态修改失败!";
        }
        return  result;
    }
}
