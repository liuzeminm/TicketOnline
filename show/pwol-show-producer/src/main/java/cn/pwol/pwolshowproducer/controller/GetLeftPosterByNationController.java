package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetLeftPosterByCityService;
import cn.pwol.pwolshowproducer.service.GetLeftPosterByNationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetLeftPosterByNationController {
    @Autowired
    private GetLeftPosterByNationService lpbn;

    @ResponseBody
    @RequestMapping(value = "/showLeftPosterByNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category){
        return lpbn.getLeftPosterByNation(category);
    }
}
