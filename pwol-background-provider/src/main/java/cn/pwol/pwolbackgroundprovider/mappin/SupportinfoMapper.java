package cn.pwol.pwolbackgroundprovider.mappin;

import cn.pwol.pwolbackgroundprovider.pojo.Supportinfo;
import cn.pwol.pwolbackgroundprovider.pojo.SupportinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupportinfoMapper {
    int countByExample(SupportinfoExample example);

    int deleteByExample(SupportinfoExample example);

    int deleteByPrimaryKey(Integer supportid);

    int insert(Supportinfo record);

    int insertSelective(Supportinfo record);

    List<Supportinfo> selectByExample(SupportinfoExample example);

    Supportinfo selectByPrimaryKey(Integer supportid);

    int updateByExampleSelective(@Param("record") Supportinfo record, @Param("example") SupportinfoExample example);

    int updateByExample(@Param("record") Supportinfo record, @Param("example") SupportinfoExample example);

    int updateByPrimaryKeySelective(Supportinfo record);

    int updateByPrimaryKey(Supportinfo record);
}