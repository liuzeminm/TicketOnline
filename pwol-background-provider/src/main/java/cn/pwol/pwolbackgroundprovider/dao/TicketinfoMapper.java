package cn.pwol.pwolbackgroundprovider.dao;

import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import cn.pwol.pwolbackgroundprovider.pojo.TicketinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TicketinfoMapper {
    int countByExample(TicketinfoExample example);

    int deleteByExample(TicketinfoExample example);

    int deleteByPrimaryKey(Integer ticketid);

    int insert(Ticketinfo record);

    int insertSelective(Ticketinfo record);

    List<Ticketinfo> selectByExample(TicketinfoExample example);

    Ticketinfo selectByPrimaryKey(Integer ticketid);

    int updateByExampleSelective(@Param("record") Ticketinfo record, @Param("example") TicketinfoExample example);

    int updateByExample(@Param("record") Ticketinfo record, @Param("example") TicketinfoExample example);

    int updateByPrimaryKeySelective(Ticketinfo record);

    int updateByPrimaryKey(Ticketinfo record);
    @Select(value = "SELECT ticketid FROM ticketinfo WHERE ticketid = 1 ")
    int selectOneStste(int ticketid);
}