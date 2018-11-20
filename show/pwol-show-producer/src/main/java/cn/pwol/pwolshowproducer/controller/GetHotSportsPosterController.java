package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.service.Impl.GetHotSportsPosterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHotSportsPosterController {
    @Autowired
    private GetHotSportsPosterServiceImpl ghsp;
    @ResponseBody
    @RequestMapping(value = "/showHotSportsPoster",method = RequestMethod.POST)
    public String showinfo(String subcategory){
        return ghsp.getGetHotSportsPosterInfo();
    }
}
