package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.DetailPageMapper;
import cn.pwol.pwolshowproducer.service.GetDetailPageTicketInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetDetailPageTicketInfoServiceImpl implements GetDetailPageTicketInfoService {
    @Autowired
    private DetailPageMapper dpm;
    @Override
    public String getDetailPageTicketInfo(int ticketid) {
        return JSON.toJSONString(dpm.getTicketInfoByID(ticketid));
    }
}
