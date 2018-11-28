package cn.pwol.pwolsearchprovider.controller;

import cn.pwol.pwolsearchprovider.pojo.Index;
import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;
import cn.pwol.pwolsearchprovider.service.SearchService;
import cn.pwol.pwolsearchprovider.util.JsonXMLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GetSeachInfoController {

    @Autowired
    private SearchService ss;
    @RequestMapping(value = "/showTicketSearchInfo",method = RequestMethod.POST)
    public String showTicketSearchInfo(@RequestBody Map<String,Object> models) throws Exception {
        TicketInfo ti = JsonXMLUtils.map2obj((Map<String, Object>) models.get("TicketInfo"), TicketInfo.class);
        SKUInfo sk = JsonXMLUtils.map2obj((Map<String, Object>) models.get("SKUInfo"), SKUInfo.class);
        Index index = JsonXMLUtils.map2obj((Map<String, Object>) models.get("Index"), Index.class);
        Integer index1 = index.getIndex();
        return ss.getTicketInfo(ti,sk,index1);
    }
}
