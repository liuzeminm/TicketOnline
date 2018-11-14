package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.service.ChangeSellStateService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangeSellStateContro {
    @Autowired
    private ChangeSellStateService changeSellStateService;

    @RequestMapping(value = "changesellstatus",method = RequestMethod.PUT)
    public String changesellstate(String orderid,String sellid){
        String changesellstateservice = changeSellStateService.changesellstateservice(orderid, sellid);
        return JSON.toJSONString(changesellstateservice);
    }
}
