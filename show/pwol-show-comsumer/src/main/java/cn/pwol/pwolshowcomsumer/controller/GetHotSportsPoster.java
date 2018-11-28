package cn.pwol.pwolshowcomsumer.controller;

import cn.pwol.pwolshowcomsumer.service.GetHotSportsPosterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHotSportsPoster {
    @Autowired
    private GetHotSportsPosterController ghspc;
    @RequestMapping(value = "/showHotSports",method = RequestMethod.POST)
    public String showinfo(){
        return ghspc.showinfo();
    }
}
