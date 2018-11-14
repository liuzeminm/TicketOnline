package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CancleOrdersDao {
    @Update(value = "update orders set order_state_id = 2 where order_id=#{orderid}" )
    int cancleordersdao(@Param("orderid") String orderid);
}
