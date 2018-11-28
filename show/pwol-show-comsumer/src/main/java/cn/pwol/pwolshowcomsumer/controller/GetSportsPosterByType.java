package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetSportsPosterByTypeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSportsPosterByType {
    @Autowired
    private GetSportsPosterByTypeController gspbtc;
    @RequestMapping(value = "/showSportsPosterType",method = RequestMethod.POST)
    public String showinfo(@RequestParam("subcategory") String subcategory){
        return gspbtc.showinfo(subcategory);
    }
}
