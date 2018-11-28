package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetLeftPosterByNationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLeftPosterByNation {
    @Autowired
    private GetLeftPosterByNationController glpbnc;
    @RequestMapping(value = "/showLeftPosterNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category){
        return glpbnc.getLeftPosterByCityController(category);
    }

}
