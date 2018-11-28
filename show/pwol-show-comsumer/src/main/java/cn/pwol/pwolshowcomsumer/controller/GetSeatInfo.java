package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetSeatInfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSeatInfo {
    @Autowired
    private GetSeatInfoController gsic;
    @RequestMapping(value = "/showSeat",method = RequestMethod.POST)
    public String showSeatInfo(@RequestParam("ticketid") int ticketid){
        return gsic.showSeatInfo(ticketid);
    }
}
