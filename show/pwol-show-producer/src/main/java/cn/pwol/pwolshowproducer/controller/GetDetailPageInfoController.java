package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetDetailPageTicketInfoService;
import cn.pwol.pwolshowproducer.service.GetSKUInfoByIDService;
import cn.pwol.pwolshowproducer.service.GetSupportInfoByIDService;
import cn.pwol.pwolshowproducer.service.GetTheaterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDetailPageInfoController {
    @Autowired
    private GetDetailPageTicketInfoService gdpti;
    @Autowired
    private GetSKUInfoByIDService gsi;
    @Autowired
    private GetSupportInfoByIDService gsib;
    @Autowired
    private GetTheaterInfoService gtis;
    @ResponseBody
    @RequestMapping(value = "/showDetailPageTicketInfo",method = RequestMethod.POST)
    public String showDetailPageTicketInfo(int ticketid){
        return gdpti.getDetailPageTicketInfo(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showDetailPageSKUInfo",method = RequestMethod.POST)
    public String ShowDetailPageSKUInfo(int ticketid){
        return gsi.getSKUInfoByID(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showDetailPageSupportInfo",method = RequestMethod.POST)
    public String ShowDetailPageSupportInfo(int ticketid){
        return gsib.getSupportInfoByID(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showTheaterInfo",method = RequestMethod.POST)
    public String ShowTheaterInfo(int ticketid){
        return gtis.getTheaterInfo(ticketid);
    }
}
