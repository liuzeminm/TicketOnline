package cn.pwol.pwolsearchconsumer.controller;

import cn.pwol.pwolsearchconsumer.service.GetTicketNumberController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetTicketNumber {
    @Autowired
    private GetTicketNumberController gtnc;
    @RequestMapping(value = "/showResultNumber",method = RequestMethod.POST)
    public String sdf(@RequestBody Map<String,Object> models) throws Exception {
        return gtnc.showTicketSearchInfo(models);
    }
}
