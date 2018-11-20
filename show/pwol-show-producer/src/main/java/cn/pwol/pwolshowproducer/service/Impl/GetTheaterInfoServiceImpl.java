package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.FirstPageMapper;
import cn.pwol.pwolshowproducer.pojo.TheaterInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetTheaterInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTheaterInfoServiceImpl implements GetTheaterInfoService {
    @Autowired
    private FirstPageMapper fpm;
    @Override
    public String getTheaterInfo(int ticketid) {
        TicketInfo theaterticketfk = fpm.getTheaterticketfk(ticketid);
        TheaterInfo theaterInfo = fpm.getTheaterInfo(theaterticketfk.getTheaterfk());
        return JSON.toJSONString(theaterInfo);
    }
}
