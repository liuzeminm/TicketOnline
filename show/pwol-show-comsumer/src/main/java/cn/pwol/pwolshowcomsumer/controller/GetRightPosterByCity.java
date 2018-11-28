package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetLeftPosterByCityController;
import cn.pwol.pwolshowcomsumer.service.GetRightPosterByCityController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRightPosterByCity {
    @Autowired
    private GetRightPosterByCityController grpbcc;
    @RequestMapping(value = "/showRightPosterCity",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category, @RequestParam("city") String city){
        return grpbcc.getLeftPosterByCityController(category,city);
    }
}
