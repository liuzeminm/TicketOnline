package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.pojo.BannerInfo;
import cn.pwol.pwolshowproducer.service.GetSportsPosterByTypeService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetSportsPosterByTypeController {
    @Autowired
    private GetSportsPosterByTypeService sgpb;
    @ResponseBody
    @RequestMapping(value = "/showSportsPosterByType",method = RequestMethod.POST)
    public String showinfo(@RequestParam("subcategory") String subcategory){
        return sgpb.GetSportsPosterByType(subcategory);
    }
}
