package cn.pwol.pwolshowproducer.service;

import cn.pwol.pwolshowproducer.pojo.FirstPageTicketInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;

public interface GetLeftPosterByCityService {

    String getLeftPosterByCity(String category, String city);

}
