package cn.pwol.pwolshowproducer.controller;

import cn.pwol.pwolshowproducer.pojo.BannerInfo;
import cn.pwol.pwolshowproducer.service.BannerInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetBannerController {
    @Autowired
    private BannerInfoService bis;

    @ResponseBody
    @RequestMapping(value = "/showBanner",method = RequestMethod.POST)
    public String showBannerInfo(){
        List<BannerInfo> bannerinfos = bis.getBanner();
        return JSON.toJSONString(bannerinfos);
    }
}
