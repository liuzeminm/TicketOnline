package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetSportsBannerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSportsBanner {
    @Autowired
    private GetSportsBannerController gsbc;
    @RequestMapping(value = "/showSportsBanners",method = RequestMethod.POST)
    public String showBanner(){
        return gsbc.showBanner();
    }
}
