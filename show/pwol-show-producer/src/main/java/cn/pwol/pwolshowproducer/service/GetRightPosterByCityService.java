package cn.pwol.pwolshowproducer.service;

import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;

import java.util.List;

public interface GetRightPosterByCityService {
    String getRightPosterByCity(String category, String city);
}
