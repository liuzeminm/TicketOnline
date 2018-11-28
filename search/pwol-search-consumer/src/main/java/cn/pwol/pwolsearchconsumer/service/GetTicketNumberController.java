package cn.pwol.pwolsearchconsumer.service;

import cn.pwol.pwolsearchconsumer.pojo.SKUInfo;
import cn.pwol.pwolsearchconsumer.pojo.TicketInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "pwol-search-provider")
public interface GetTicketNumberController {
    @RequestMapping(value = "/showTicketNumber",method = RequestMethod.POST)
    public String showTicketSearchInfo(@RequestBody Map<String,Object> models) throws Exception;

}
