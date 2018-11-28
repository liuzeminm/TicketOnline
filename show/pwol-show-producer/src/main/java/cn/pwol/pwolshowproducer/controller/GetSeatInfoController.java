package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetSeatInfoByTicketIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetSeatInfoController {
    @Autowired
    private GetSeatInfoByTicketIDService gsibti;
    @ResponseBody
    @RequestMapping(value = "/showSeatInfo",method = RequestMethod.POST)
    public String showSeatInfo(@RequestParam("ticketid") int ticketid){
        return gsibti.getSeatInfo(ticketid);
    }
}
