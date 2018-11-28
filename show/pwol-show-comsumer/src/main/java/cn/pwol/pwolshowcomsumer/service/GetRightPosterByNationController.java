package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "pwol-show-provider")
public interface GetRightPosterByNationController {

    @RequestMapping(value = "/showRightPosterByNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category);
}
