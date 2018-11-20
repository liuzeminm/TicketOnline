package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.FirstPageMapper;
import cn.pwol.pwolshowproducer.mapping.FirstPageRightPosterMapper;
import cn.pwol.pwolshowproducer.mapping.HotSportsMapper;
import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TheaterInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetHotSportsPosterService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class GetHotSportsPosterServiceImpl implements GetHotSportsPosterService {

    @Autowired
    private FirstPageRightPosterMapper fprp;
    @Autowired
    private FirstPageMapper fpm;
    @Autowired
    private HotSportsMapper hsm;
    @Override
    public String getGetHotSportsPosterInfo() {
        List<TicketInfo> sportsTicketInfoList = hsm.getHotSportTicketInfo();
        List<FirstPageTicketInfo> fptilist = new ArrayList<FirstPageTicketInfo>();
        for (TicketInfo ti:sportsTicketInfoList) {
            Integer ticketid = ti.getTicketid();
            Integer theaterfk = ti.getTheaterfk();
            TheaterInfo theaterInfo = fpm.getTheaterInfo(theaterfk);
            SKUInfo minTicketPrice = fpm.getMinTicketPrice(ticketid);
            SKUInfo maxTicketPrice = fpm.getMaxTicketPrice(ticketid);
            String min = String.valueOf(minTicketPrice.getPrice());
            String max = String.valueOf(maxTicketPrice.getPrice());
            SKUInfo firstDate = fprp.getFirstDate(ticketid);
            SKUInfo lastDate = fprp.getLastDate(ticketid);
            Date firstshowdate = firstDate.getShowdate();
            Date lastshowdate = lastDate.getShowdate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String startDate = sdf.format(firstshowdate);
            String endDate = sdf.format(lastshowdate);
            FirstPageTicketInfo fpti = new FirstPageTicketInfo();
            fpti.setPicurl(ti.getPicurl());
            fpti.setTitle(ti.getTitle());
            fpti.setFpticketid(ticketid);
            fpti.setMinprice(min);
            fpti.setMaxprice(max);
            fpti.setShowplace(theaterInfo.getTheatername());
            fpti.setStartDate(startDate);
            fpti.setEndDate(endDate);
            fpti.setCity(ti.getCity());
            fptilist.add(fpti);
        }
        return JSON.toJSONString(fptilist);
    }
}
