package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.FirstPageMapper;
import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetLeftPosterByCityService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetLeftPosterByCityServiceImpl implements GetLeftPosterByCityService {
    @Autowired
    private FirstPageMapper fpm;


    @Override
    public String getLeftPosterByCity(String category, String city) {
        FirstPageTicketInfo fpti = new FirstPageTicketInfo();
        TicketInfo ticketInfo = fpm.getTicketInfo(category, city);
        SKUInfo minTicketPrice = fpm.getMinTicketPrice(ticketInfo.getTicketid());
        fpti.setFpticketid(ticketInfo.getTicketid());
        fpti.setPicurl(ticketInfo.getPicurl());
        fpti.setTitle(ticketInfo.getTitle());
        String s = String.valueOf(minTicketPrice.getPrice());
        fpti.setMinprice(s);
        return JSON.toJSONString(fpti);
    }
}
