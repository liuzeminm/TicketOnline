package cn.pwol.pwolbackgroundprovider.service.impl;

import cn.pwol.pwolbackgroundprovider.mappin.*;
import cn.pwol.pwolbackgroundprovider.pojo.*;
import cn.pwol.pwolbackgroundprovider.service.AddTheaterInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AddTheaterInformationImpl implements AddTheaterInformation {
    @Autowired
    BannerinfoMapper bannerinfoMapper;
    @Autowired
    SeatinfoMapper seatinfoMapper;
    @Autowired
    SkuinfoMapper skuinfoMapper;
    @Autowired
    SupportinfoMapper supportinfoMapper;
    @Autowired
    TicketinfoMapper ticketinfoMapper;
    @Override
    public boolean AddTheaterInformation(Ticketinfo ticketinfo) {
        if (ticketinfoMapper.insertSelective(ticketinfo) != 1){
            return false;
        }
        return true;
    }

    @Override
    public boolean AddSku(Skuinfo skuinfo) {
        if (skuinfoMapper.insertSelective(skuinfo) != 1){
            return false;

        }
        return true;
    }

    @Override
    public boolean AddSeatInformation(Seatinfo seatinfo) {
        for (int i = 0 ; i < 50 ; i++) {
            if (seatinfoMapper.insertSelective(seatinfo) != 1) {
                return false;
            }
            seatinfo.setSeatid(seatinfo.getSeatid() + 1);
        }
        return true;
    }

    @Override
    public boolean AddBannerinfo(Bannerinfo bannerinfo) {
        if (bannerinfoMapper.insertSelective(bannerinfo) != 1){
            return false;
        }
        return false;
    }

    @Override
    public boolean Addsupportinfo(Supportinfo supportinfo) {
        if(supportinfoMapper.insertSelective(supportinfo) != 1){
            return false;
        }
        return true;
    }

  /*  @Override
    public boolean AddMessage(Ticketinfo ticketinfo, List<Skuinfo> skuinfoList, List<Seatinfo> seatinfoList, Bannerinfo bannerinfo, Supportinfo supportinfo) {

        if (!AddBannerinfo(bannerinfo)){
            return false;
        }
        if (!AddTheaterInformation(ticketinfo)){
            return false;
        }

        if (Addsupportinfo(supportinfo)){
            return false;
        }
        for (Seatinfo seatinfo : seatinfoList) {
            if (!AddSeatInformation(seatinfo)) {
                return false;
            }
        }
        for (Skuinfo skuinfo : skuinfoList) {
            if (!AddSku(skuinfo)){
                return false;
            }
        }
        return true;

    }*/
}
