package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.BannerInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportsMapper {
    List<TicketInfo> getTicketInfoByType(String subcategory);
}