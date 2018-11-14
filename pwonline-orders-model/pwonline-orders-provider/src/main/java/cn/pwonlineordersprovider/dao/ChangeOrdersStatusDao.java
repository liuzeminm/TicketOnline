package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 修改订单状态
 */
@Repository
@Mapper
public interface ChangeOrdersStatusDao {
    @Update(value = "update orders set order_state_id =#{orderstateid} where order_id = #{orderid} ")
    int changeordersstatusdao(@Param("orderstateid")int orderstateid,@Param("orderid") String orderid);
}
