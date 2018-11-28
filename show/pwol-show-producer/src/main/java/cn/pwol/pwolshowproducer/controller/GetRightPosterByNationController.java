package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetRightPosterByCityService;
import cn.pwol.pwolshowproducer.service.GetRightPosterByNationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetRightPosterByNationController {
    @Autowired
    private GetRightPosterByNationService rpbn;

    @ResponseBody
    @RequestMapping(value = "/showRightPosterByNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category){
        return rpbn.getRightPosterByNation(category);
    }
}
