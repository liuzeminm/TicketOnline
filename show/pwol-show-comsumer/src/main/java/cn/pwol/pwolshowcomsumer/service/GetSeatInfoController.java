package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "pwol-show-provider")
public interface GetSeatInfoController {

    @RequestMapping(value = "/showSeatInfo",method = RequestMethod.POST)
    public String showSeatInfo(@RequestParam("ticketid") int ticketid);
}
