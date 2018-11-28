package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "pwol-show-provider")
public interface GetSportsPosterByTypeController {

    @RequestMapping(value = "/showSportsPosterByType",method = RequestMethod.POST)
    public String showinfo(@RequestParam("subcategory") String subcategory);
}
