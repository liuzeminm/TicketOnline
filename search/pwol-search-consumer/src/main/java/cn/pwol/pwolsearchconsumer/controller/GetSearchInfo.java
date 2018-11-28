package cn.pwol.pwolsearchconsumer.controller;

import cn.pwol.pwolsearchconsumer.service.GetSeachInfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetSearchInfo {
    @Autowired
    private GetSeachInfoController gsic;
    @RequestMapping(value = "/showTicketSearch",method = RequestMethod.POST)
    public String getSearchInfo(@RequestBody Map<String,Object> models) throws Exception {
        return gsic.showTicketSearchInfo(models);
    }
}
