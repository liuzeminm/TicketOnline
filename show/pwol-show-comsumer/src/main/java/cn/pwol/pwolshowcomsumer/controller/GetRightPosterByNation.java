package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetLeftPosterByNationController;
import cn.pwol.pwolshowcomsumer.service.GetRightPosterByNationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRightPosterByNation {
    @Autowired
    private GetRightPosterByNationController grpbnc;
    @RequestMapping(value = "/showRightPosterNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category){
        return grpbnc.getLeftPosterByCityController(category);
    }

}
