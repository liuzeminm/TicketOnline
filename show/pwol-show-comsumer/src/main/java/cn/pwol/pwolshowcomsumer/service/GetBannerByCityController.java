package cn.pwol.pwolshowcomsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "pwol-show-provider")
public interface GetBannerByCityController {
    @RequestMapping(value = "/showBannerByCity",method = RequestMethod.POST)
    public String showBanner(@RequestParam("cityName") String cityName);
}
