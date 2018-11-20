package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.FirstPageMapper;
import cn.pwol.pwolshowproducer.mapping.FirstPageRightPosterMapper;
import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TheaterInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetRightPosterByCityService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GetRightPosterByCityServiceImpl implements GetRightPosterByCityService {

    @Autowired
    private FirstPageRightPosterMapper fprp;
    @Autowired
    private FirstPageMapper fpm;

    @Override
    public String getRightPosterByCity(String category, String city) {
        List<FirstPageTicketInfo> fptilist = new ArrayList<FirstPageTicketInfo>();
        List<TicketInfo> rightPosterInfoList = fprp.getRightPosterTicketInfo(category, city);

        for (TicketInfo ti:rightPosterInfoList) {
            SKUInfo minTicketPrice = fpm.getMinTicketPrice(ti.getTicketid());
            String min = String.valueOf(minTicketPrice.getPrice());
            Integer theaterfk = ti.getTheaterfk();
            TheaterInfo theaterInfo = fpm.getTheaterInfo(theaterfk);
            SKUInfo firstDate = fprp.getFirstDate(ti.getTicketid());
            SKUInfo lastDate = fprp.getLastDate(ti.getTicketid());
            Date firstshowdate = firstDate.getShowdate();
            Date lastshowdate = lastDate.getShowdate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String startDate = sdf.format(firstshowdate);
            String endDate = sdf.format(lastshowdate);
            FirstPageTicketInfo fpti = new FirstPageTicketInfo();
            fpti.setPicurl(ti.getPicurl());
            fpti.setShowplace(theaterInfo.getTheatername());
            fpti.setTitle(ti.getTitle());
            fpti.setFpticketid(ti.getTicketid());
            fpti.setMinprice(min);
            fpti.setStartDate(startDate);
            fpti.setEndDate(endDate);
            fptilist.add(fpti);
        }

        return JSON.toJSONString(fptilist);
    }
}
