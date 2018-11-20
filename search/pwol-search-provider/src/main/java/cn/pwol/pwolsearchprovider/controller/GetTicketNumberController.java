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
public class GetTicketNumberController {

    @Autowired
    private SearchService ss;

    @ResponseBody
    @RequestMapping(value = "/showTicketNumber",method = RequestMethod.POST)
    public String showTicketNumber(TicketInfo ti, SKUInfo sk){
         return ss.getTicketNumber(ti,sk);
    }

}
