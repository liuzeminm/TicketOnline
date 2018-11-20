package cn.pwonlinepaymentprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Turn {
    @RequestMapping("indexs")
    public String turn(){return "indexss";}
}
