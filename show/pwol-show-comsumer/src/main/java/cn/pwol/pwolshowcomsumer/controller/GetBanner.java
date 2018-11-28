package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetBannerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBanner {
    @Autowired
    private GetBannerController gbc;
    @RequestMapping(value = "/showBanner",method = RequestMethod.POST)
    public String showBanner(){
        return gbc.showBannerInfo();
    }
}
