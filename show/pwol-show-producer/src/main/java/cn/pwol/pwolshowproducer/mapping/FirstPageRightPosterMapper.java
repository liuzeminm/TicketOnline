package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.pojo.TicketInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirstPageRightPosterMapper {

    /**
     *根据类型、城市名获得票信息
     * @param category 分类
     * @param city 城市
     * @return
     */
    List<TicketInfo> getRightPosterTicketInfo(String category, String city);

    /**
     * 根据ticketid获取第一个时间
     * @param ticketfk
     * @return
     */
    SKUInfo getFirstDate(int ticketfk);

    /**
     * 根据ticketid获取最后一个时间
     * @param ticketfk
     * @return
     */
    SKUInfo getLastDate(int ticketfk);

    /**
     *根据类型获得票信息
     * @param category 分类
     * @return
     */
    List<TicketInfo> getRightPosterTicketInfoByNation(String category);
}