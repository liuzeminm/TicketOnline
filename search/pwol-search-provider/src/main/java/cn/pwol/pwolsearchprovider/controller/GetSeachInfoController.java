package cn.pwol.pwolsearchprovider.controller;

import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;
import cn.pwol.pwolsearchprovider.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSeachInfoController {

    @Autowired
    private SearchService ss;

    @ResponseBody
    @RequestMapping(value = "/showTicketSearchInfo",method = RequestMethod.POST)
    public String showTicketSearchInfo(TicketInfo ti, SKUInfo sk, int index){
        return ss.getTicketInfo(ti,sk,index);
    }
}
