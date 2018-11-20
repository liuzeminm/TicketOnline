package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.DetailPageMapper;
import cn.pwol.pwolshowproducer.mapping.SupportInfoMapper;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import cn.pwol.pwolshowproducer.service.GetSupportInfoByIDService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetSupportInfoByIDServiceImpl implements GetSupportInfoByIDService {
    @Autowired
    private DetailPageMapper dpm;
    @Override
    public String getSupportInfoByID(int ticketid) {
        TicketInfo ticketInfoByID = dpm.getTicketInfoByID(ticketid);
        return JSON.toJSONString(dpm.getSupprotInfoByID(ticketInfoByID.getSupportfk()));
    }
}
