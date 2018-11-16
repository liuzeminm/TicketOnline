package cn.pwonlineordersprovider.dao;

import entity.OrderState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderStatusDao {
    @Select(value = "select state_type from order_state where state_id = #{order_state_id}")
    OrderState getorderstate(@Param("order_state_id")int order_state_id);
}
