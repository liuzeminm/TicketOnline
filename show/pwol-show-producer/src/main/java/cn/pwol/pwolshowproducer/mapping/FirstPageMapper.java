package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirstPageMapper {

    /**
     *根据类型、城市名获得票信息
     * @param category 分类
     * @param city 城市
     * @return
     */
    TicketInfo getTicketInfo(String category,String city);

    /**
     * 根据ticketid获取最高票价
     * @param ticketfk
     * @return
     */
    SKUInfo getMaxTicketPrice(int ticketfk);

    /**
     * 根据ticketid获取最低票价
     * @param ticketfk
     * @return
     */
    SKUInfo getMinTicketPrice(int ticketfk);

    /**
     * 根据类型获得票信息
     * @param category
     * @return
     */
    TicketInfo getTicketInfoByNation(String category);

    /**
     * 根据ticketfk获取剧场信息
     * @param ticketid
     * @return
     */
    TheaterInfo getTheaterInfo(int ticketid);

    /**
     * 根据ticketid获取剧场外键
     * @param ticketid
     * @return
     */
    TicketInfo getTheaterticketfk(int ticketid);
}