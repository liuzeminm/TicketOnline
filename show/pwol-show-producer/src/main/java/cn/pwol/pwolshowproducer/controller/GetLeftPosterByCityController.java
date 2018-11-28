package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetLeftPosterByCityService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetLeftPosterByCityController {
    @Autowired
    private GetLeftPosterByCityService lpbc;

    @ResponseBody
    @RequestMapping(value = "/showLeftPosterByCity",method = RequestMethod.POST)
    public String getLeftPosterByCityController(@RequestParam("category") String category, @RequestParam("city") String city){
        return lpbc.getLeftPosterByCity(category,city);
    }
}
