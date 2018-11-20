package cn.pwol.pwolsearchprovider.service.impl;

import cn.pwol.pwolsearchprovider.mapping.SearchMapper;
import cn.pwol.pwolsearchprovider.pojo.*;
import cn.pwol.pwolsearchprovider.service.SearchService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper sm;
    @Override
    public String getTicketInfo(TicketInfo ti, SKUInfo sk ,int index) {
        PageHelper.startPage(index,20);
        List<SearchPageInfo> searchresultinfo = new ArrayList<SearchPageInfo>();
        List<TicketInfo> searchlist = sm.getSearchInfo(ti, sk);
        for (TicketInfo tl:searchlist) {
            Integer ticketid = tl.getTicketid();
            Integer theaterfk = tl.getTheaterfk();
            TheaterInfo theaterInfo = sm.gettheaterInfo(theaterfk);
            SKUInfo firstDate = sm.getFirstDate(ticketid);
            SKUInfo lastDate = sm.getLastDate(ticketid);
            SKUInfo minTicketPrice = sm.getMinTicketPrice(ticketid);
            SKUInfo maxTicketPrice = sm.getMaxTicketPrice(ticketid);
            String min = String.valueOf(minTicketPrice.getPrice());
            String max = String.valueOf(maxTicketPrice.getPrice());
            Date firstshowdate = firstDate.getShowdate();
            Date lastshowdate = lastDate.getShowdate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String startDate = sdf.format(firstshowdate);
            String endDate = sdf.format(lastshowdate);
            SearchPageInfo spi = new SearchPageInfo();
            spi.setSpticketid(ticketid);
            spi.setCity(tl.getCity());
            spi.setDescription(tl.getDescription());
            spi.setStarttime(startDate);
            spi.setEndtime(endDate);
            spi.setMinprice(min);
            spi.setMaxprice(max);
            spi.setPirurl(tl.getPicurl());
            spi.setShowplace(theaterInfo.getTheatername());
            spi.setTicketstatus(tl.getStatus());
            spi.setTitle(tl.getTitle());
            searchresultinfo.add(spi);
        }
        PageInfo p = new PageInfo(searchresultinfo);
        return JSON.toJSONString(p);
    }

    @Override
    public String getTicketNumber(TicketInfo ti, SKUInfo sk) {
        return JSON.toJSONString(sm.getTicketNumber(ti, sk));
    }
}
