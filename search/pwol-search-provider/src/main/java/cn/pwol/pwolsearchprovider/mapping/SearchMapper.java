package cn.pwol.pwolsearchprovider.mapping;

import cn.pwol.pwolsearchprovider.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchMapper {
    /**
     * 动态查询票务信息数量
     * @param ti
     * @return
     */
    int getTicketNumber(@Param("ti") TicketInfo ti,@Param("sk") SKUInfo sk);

    /**
     * 动态查询票务信息
     * @param ti
     * @param sk
     * @return
     */
    List<TicketInfo> getSearchInfo(@Param("ti") TicketInfo ti, @Param("sk") SKUInfo sk);

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
     * 根据theaterfk获得showplace
     * @param theaterfk
     * @return
     */
    TheaterInfo gettheaterInfo(int theaterfk);

}
