package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ChangeSellStateDao {
    @Update(value = "update orders set order_sellstate_id = #{sellid} where  order_id = #{orderid}")
    int changesellstatedao(@Param("orderid") String orderid, @Param("sellid") int sellid);
}
