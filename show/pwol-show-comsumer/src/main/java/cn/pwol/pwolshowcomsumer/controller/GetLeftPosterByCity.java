package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetLeftPosterByCityController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLeftPosterByCity {
    @Autowired
    private GetLeftPosterByCityController glpbcc;
    @RequestMapping(value = "/showLeftPosterCity",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category, @RequestParam("city") String city){
        return glpbcc.getLeftPosterByCityController(category,city);
    }
}
