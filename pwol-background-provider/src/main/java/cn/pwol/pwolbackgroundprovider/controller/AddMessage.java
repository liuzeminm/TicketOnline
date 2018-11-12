package cn.pwol.pwolbackgroundprovider.controller;

import cn.pwol.pwolbackgroundprovider.pojo.*;
import cn.pwol.pwolbackgroundprovider.service.impl.AddTheaterInformationImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Api(tags = "全部信息")
public class AddMessage {
    @Autowired
    private AddTheaterInformationImpl addTheaterInformation;


    @ApiOperation(value = "添加信息", notes = "添加所有信息")
    @PutMapping(value = "/bockground/add")
    public String Addall(@ApiParam(required = true, name = "ticketinfo", value = "售票信息") @RequestBody Ticketinfo ticketinfo,
                         @ApiParam(required = true, name = "skuinfoList", value = "票sku") @RequestBody List<Skuinfo> skuinfoList,
                         @ApiParam(required = true, name = "seatinfoList", value = "剧场信息") @RequestBody List<Seatinfo> seatinfoList,
                         @ApiParam(required = true, name = "bannerinfo", value = "轮播图") @RequestBody Bannerinfo bannerinfo,
                         @ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody Supportinfo supportinfo){
        String State = "添加失败";
        boolean b = addTheaterInformation.AddMessage(ticketinfo, skuinfoList, seatinfoList, bannerinfo, supportinfo);
        if (b)
        State = "添加成功";
        return State;
    }

    @ApiOperation(value = "添加", notes = "添加所有")
    @PutMapping(value = "/bockground/a")
    public String Addsupportinfo(@ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody Supportinfo supportinfo){
        boolean addsupportinfo = addTheaterInformation.Addsupportinfo(supportinfo);
        return "ccc";
    }

    @ApiOperation(value = "添加", notes = "添加所有")
    @PutMapping(value = "/bockground/a")
    public String AddBannerinfo(@ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody Bannerinfo bannerinfo){
        boolean addBannerinfo = addTheaterInformation.AddBannerinfo(bannerinfo);
        return "ccc";
    }

    @ApiOperation(value = "添加", notes = "添加所有")
    @PutMapping(value = "/bockground/a")
    public String addsupportinfo(@ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody  Seatinfo seatinfo){
        boolean addsupportinfo = addTheaterInformation.AddSeatInformation(seatinfo);
        return "ccc";
    }

    @ApiOperation(value = "添加", notes = "添加所有")
    @PutMapping(value = "/bockground/a")
    public String AddSku(@ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody Skuinfo skuinfo){
        boolean addSku = addTheaterInformation.AddSku(skuinfo);
        return "ccc";
    }

    @ApiOperation(value = "添加", notes = "添加所有")
    @PutMapping(value = "/bockground/a")
    public String AddTheaterInformation(@ApiParam(required = true, name = "supportinfo", value = "支持情况") @RequestBody Ticketinfo ticketinfo){
        boolean a = addTheaterInformation.AddTheaterInformation(ticketinfo);
        return "ccc";
    }
}
