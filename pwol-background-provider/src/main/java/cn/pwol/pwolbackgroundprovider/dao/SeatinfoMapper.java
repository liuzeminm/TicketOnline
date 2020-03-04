package cn.pwol.pwolbackgroundprovider.dao;

import cn.pwol.pwolbackgroundprovider.pojo.Seatinfo;
import cn.pwol.pwolbackgroundprovider.pojo.SeatinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatinfoMapper {
    int countByExample(SeatinfoExample example);

    int deleteByExample(SeatinfoExample example);

    int deleteByPrimaryKey(Integer seatid);

    int insert(Seatinfo record);

    int insertSelective(Seatinfo record);

    List<Seatinfo> selectByExample(SeatinfoExample example);

    Seatinfo selectByPrimaryKey(Integer seatid);

    int updateByExampleSelective(@Param("record") Seatinfo record, @Param("example") SeatinfoExample example);

    int updateByExample(@Param("record") Seatinfo record, @Param("example") SeatinfoExample example);

    int updateByPrimaryKeySelective(Seatinfo record);

    int updateByPrimaryKey(Seatinfo record);
}