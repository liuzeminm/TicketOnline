package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient(name = "pwol-show-provider")
public interface GetSportsBannerController {

    @RequestMapping(value = "/showSportsBanner",method = RequestMethod.POST)
    public String showBanner();
}
