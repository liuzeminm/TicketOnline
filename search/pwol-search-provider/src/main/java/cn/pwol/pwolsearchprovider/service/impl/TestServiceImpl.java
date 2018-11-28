package cn.pwol.pwolsearchprovider.service.impl;

import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.Search;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;
import cn.pwol.pwolsearchprovider.service.SearchService;
import cn.pwol.pwolsearchprovider.service.TestService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private SearchService ss;

    @Override
    public String getNumber(Search s) {
        if (s.getTi() == null){
            TicketInfo ti = new TicketInfo();
            s.setTi(ti);
        }
        if (s.getSk() == null){
            SKUInfo sk = new SKUInfo();
            s.setSk(sk);
        }
        String ticketNumber = ss.getTicketNumber(s.getTi(),s.getSk());
        return JSON.toJSONString(ticketNumber);
    }
}
