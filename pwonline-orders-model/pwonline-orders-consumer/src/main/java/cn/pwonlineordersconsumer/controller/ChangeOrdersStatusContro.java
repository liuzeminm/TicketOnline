package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.service.ChangeOrdersStatusService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangeOrdersStatusContro {
    @Autowired
    private ChangeOrdersStatusService changeOrdersStatusService;
    @RequestMapping(value = "changeordersatusimpl",method = RequestMethod.PUT)
    public String changeordersstatus(String orderstate,String orderid){
        int  orderstateid = Integer.parseInt(orderstate);
        String changeordersstaus = changeOrdersStatusService.changeordersstaus(orderstateid, orderid);
        return JSON.toJSONString(changeordersstaus);
    }
}
