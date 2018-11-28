package cn.pwol.pwolshowcomsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "pwol-show-provider")
public interface GetRightPosterByCityController {

    @RequestMapping(value = "/showRightPosterByCity",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category, @RequestParam("city") String city);
}
