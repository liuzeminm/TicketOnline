package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.service.ChangePerStatusService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangePerStatusContro {
    @Autowired
    private ChangePerStatusService changePerStatusService;
    @RequestMapping(value = "changeperstate",method = RequestMethod.PUT)
    public String changeperstatus(String orderid,String perstusid){
        int perstatusid = Integer.parseInt(perstusid);
        String changepersstatusservice = changePerStatusService.changepersstatusservice(orderid, perstatusid);
        return JSON.toJSONString(changepersstatusservice);
    }
}
