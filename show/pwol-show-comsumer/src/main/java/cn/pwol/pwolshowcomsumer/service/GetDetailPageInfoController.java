package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "pwol-show-provider")
public interface GetDetailPageInfoController {

    @RequestMapping(value = "/showDetailPageTicketInfo",method = RequestMethod.POST)
    public String showDetailPageTicketInfo(@RequestParam("ticketid") int ticketid);


    @RequestMapping(value = "/showDetailPageSKUInfo",method = RequestMethod.POST)
    public String ShowDetailPageSKUInfo(@RequestParam("ticketid") int ticketid);


    @RequestMapping(value = "/showDetailPageSupportInfo",method = RequestMethod.POST)
    public String ShowDetailPageSupportInfo(@RequestParam("ticketid") int ticketid);

    @RequestMapping(value = "/showTheaterInfo",method = RequestMethod.POST)
    public String ShowTheaterInfo(@RequestParam("ticketid") int ticketid);
}
