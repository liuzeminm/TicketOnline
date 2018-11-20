package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.GetRightPosterByCityService;
import cn.pwol.pwolshowproducer.service.GetRightPosterByNationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRightPosterByNationController {
    @Autowired
    private GetRightPosterByNationService rpbn;

    @ResponseBody
    @RequestMapping(value = "/showRightPosterByNation",method = RequestMethod.POST)
    public String getLeftPosterByCityController(String category){
        return rpbn.getRightPosterByNation(category);
    }
}
