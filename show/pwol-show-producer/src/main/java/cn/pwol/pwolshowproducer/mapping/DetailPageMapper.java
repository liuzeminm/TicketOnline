package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.SupportInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DetailPageMapper {
    /**
     * 根据ticketid获取SKU信息
     * @param ticketid
     * @return
     */
    List<SKUInfo> getSKUInfo(int ticketid);

    /**
     * 根据ticketid获取票务信息
     * @param ticketid
     * @return
     */
    TicketInfo getTicketInfoByID(int ticketid);

    /**
     * 根据supportid获取信息
     * @param supprotid
     * @return
     */
    SupportInfo getSupprotInfoByID(int supprotid);

}
