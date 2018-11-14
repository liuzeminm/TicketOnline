package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ChangePerStatusDao {
    @Update(value = "update orders set order_personalstate_id = #{perstatusid} where order_id = #{orderid}")
    int changePerStatusdao(@Param("orderid") String orderid,@Param("perstatusid") int perstatusid);
}
