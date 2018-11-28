package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetDetailPageTicketInfoService;
import cn.pwol.pwolshowproducer.service.GetSKUInfoByIDService;
import cn.pwol.pwolshowproducer.service.GetSupportInfoByIDService;
import cn.pwol.pwolshowproducer.service.GetTheaterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String showDetailPageTicketInfo(@RequestParam("ticketid") int ticketid){
        return gdpti.getDetailPageTicketInfo(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showDetailPageSKUInfo",method = RequestMethod.POST)
    public String ShowDetailPageSKUInfo(@RequestParam("ticketid") int ticketid){
        return gsi.getSKUInfoByID(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showDetailPageSupportInfo",method = RequestMethod.POST)
    public String ShowDetailPageSupportInfo(@RequestParam("ticketid") int ticketid){
        return gsib.getSupportInfoByID(ticketid);
    }

    @ResponseBody
    @RequestMapping(value = "/showTheaterInfo",method = RequestMethod.POST)
    public String ShowTheaterInfo(@RequestParam("ticketid") int ticketid){
        return gtis.getTheaterInfo(ticketid);
    }
}
