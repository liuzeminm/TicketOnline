package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetLeftPosterByCityService;
import cn.pwol.pwolshowproducer.service.GetRightPosterByCityService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetRightPosterByCityController {
    @Autowired
    private GetRightPosterByCityService rpbc;

    @ResponseBody
    @RequestMapping(value = "/showRightPosterByCity",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category, @RequestParam("city") String city){
        return rpbc.getRightPosterByCity(category,city);
    }
}
