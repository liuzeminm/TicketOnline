package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.FirstPageMapper;
import cn.pwol.pwolshowproducer.mapping.SeatInfoMapper;
import cn.pwol.pwolshowproducer.pojo.SeatInfo;
import cn.pwol.pwolshowproducer.pojo.TheaterInfo;
import cn.pwol.pwolshowproducer.service.GetSeatInfoByTicketIDService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetSeatInfoByTicketIDServiceImpl implements GetSeatInfoByTicketIDService {
    @Autowired
    private SeatInfoMapper seatim;
    @Autowired
    private FirstPageMapper fpm;
    @Override
    public String getSeatInfo(int ticketid) {
        TheaterInfo theaterInfo = fpm.getTheaterInfo(ticketid);
        Integer theaterid = theaterInfo.getTheaterid();
        List<SeatInfo> seatInfoBy = seatim.getSeatInfoBy(theaterid);
        for (SeatInfo si:seatInfoBy) {
            Integer ticketprice = si.getTicketprice();
        }
        return JSON.toJSONString(seatInfoBy);
    }
}
