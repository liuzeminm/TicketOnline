package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetBannerByCityController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBannerByCity {
    @Autowired
    private GetBannerByCityController gbbcc;
    @RequestMapping(value = "/showBannerByCityName",method = RequestMethod.POST)
    public String showBannerByCityName(@RequestParam("cityName") String cityName){
        return gbbcc.showBanner(cityName);
    }
}
