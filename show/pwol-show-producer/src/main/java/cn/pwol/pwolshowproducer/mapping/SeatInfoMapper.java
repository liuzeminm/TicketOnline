package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.SeatInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatInfoMapper {
    /**
     * 根据theaterid获取座位信息
     * @param theaterid
     * @return
     */
    List<SeatInfo> getSeatInfoBy(int theaterid);
}