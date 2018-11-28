package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.Impl.GetHotSportsPosterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetHotSportsPosterController {
    @Autowired
    private GetHotSportsPosterServiceImpl ghsp;
    @ResponseBody
    @RequestMapping(value = "/showHotSportsPoster",method = RequestMethod.POST)
    public String showinfo(){
        return ghsp.getGetHotSportsPosterInfo();
    }
}
