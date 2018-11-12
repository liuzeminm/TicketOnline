package cn.pwol.pwolbackgroundprovider.mappin;

import cn.pwol.pwolbackgroundprovider.pojo.Skuinfo;
import cn.pwol.pwolbackgroundprovider.pojo.SkuinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkuinfoMapper {
    int countByExample(SkuinfoExample example);

    int deleteByExample(SkuinfoExample example);

    int deleteByPrimaryKey(Integer skuid);

    int insert(Skuinfo record);

    int insertSelective(Skuinfo record);

    List<Skuinfo> selectByExample(SkuinfoExample example);

    Skuinfo selectByPrimaryKey(Integer skuid);

    int updateByExampleSelective(@Param("record") Skuinfo record, @Param("example") SkuinfoExample example);

    int updateByExample(@Param("record") Skuinfo record, @Param("example") SkuinfoExample example);

    int updateByPrimaryKeySelective(Skuinfo record);

    int updateByPrimaryKey(Skuinfo record);
}