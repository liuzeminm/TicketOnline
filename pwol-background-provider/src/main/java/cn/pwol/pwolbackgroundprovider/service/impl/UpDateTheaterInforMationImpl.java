package cn.pwol.pwolbackgroundprovider.service.impl;

import cn.pwol.pwolbackgroundprovider.mappin.SeatinfoMapper;
import cn.pwol.pwolbackgroundprovider.mappin.SkuinfoMapper;
import cn.pwol.pwolbackgroundprovider.mappin.TicketinfoMapper;
import cn.pwol.pwolbackgroundprovider.pojo.Seatinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Skuinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import cn.pwol.pwolbackgroundprovider.service.UpDateTheaterInforMation;
import org.springframework.beans.factory.annotation.Autowired;

public class UpDateTheaterInforMationImpl implements UpDateTheaterInforMation {
    @Autowired
    private SkuinfoMapper skuinfoMapper;
    @Autowired
    private SeatinfoMapper seatinfoMapper;
    @Autowired
    private TicketinfoMapper ticketinfoMapper;
    @Override
    public int upDateskuinfo(Skuinfo skuinfo) {
        return skuinfoMapper.updateByPrimaryKeySelective(skuinfo);
    }

    @Override
    public int upDateseatinfo(Seatinfo seatinfo) {
        return seatinfoMapper.updateByPrimaryKeySelective(seatinfo);

    }

    @Override
    public int upDateTicketInfo(Ticketinfo ticketinfo) {

        return ticketinfoMapper.updateByPrimaryKeySelective(ticketinfo);
    }
}
