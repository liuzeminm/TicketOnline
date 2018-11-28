package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetDetailPageInfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDetailPageInfo {
    @Autowired
    private GetDetailPageInfoController gdpic;
    @RequestMapping(value = "/showDetailPageTicket",method = RequestMethod.POST)
    public String showDetailPageTicket(@RequestParam("ticketid") int ticketid){
        return gdpic.showDetailPageTicketInfo(ticketid);
    }


    @RequestMapping(value = "/showDetailPageSKU",method = RequestMethod.POST)
    public String ShowDetailPageSKUInfo(@RequestParam("ticketid") int ticketid){
        return gdpic.ShowDetailPageSKUInfo(ticketid);
    }


    @RequestMapping(value = "/showDetailPageSupport",method = RequestMethod.POST)
    public String ShowDetailPageSupportInfo(@RequestParam("ticketid") int ticketid){
        return gdpic.ShowDetailPageSupportInfo(ticketid);
    }

    @RequestMapping(value = "/showTheater",method = RequestMethod.POST)
    public String ShowTheaterInfo(@RequestParam("ticketid") int ticketid){
        return gdpic.ShowTheaterInfo(ticketid);
    }

}
