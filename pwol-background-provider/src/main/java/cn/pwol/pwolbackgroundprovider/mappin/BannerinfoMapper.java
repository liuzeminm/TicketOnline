package cn.pwol.pwolbackgroundprovider.mappin;

import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.BannerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BannerinfoMapper {
    int countByExample(BannerinfoExample example);

    int deleteByExample(BannerinfoExample example);

    int deleteByPrimaryKey(Integer bannerid);

    int insert(Bannerinfo record);

    int insertSelective(Bannerinfo record);

    List<Bannerinfo> selectByExample(BannerinfoExample example);

    Bannerinfo selectByPrimaryKey(Integer bannerid);

    int updateByExampleSelective(@Param("record") Bannerinfo record, @Param("example") BannerinfoExample example);

    int updateByExample(@Param("record") Bannerinfo record, @Param("example") BannerinfoExample example);

    int updateByPrimaryKeySelective(Bannerinfo record);

    int updateByPrimaryKey(Bannerinfo record);

    @Select(value = "SELECT bennerid FROM ticketinfo WHERE bennerid = 1 ")
    int selectOneStste(int bennerid);
}