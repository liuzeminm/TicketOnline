package cn.pwonlineordersprovider.dao;

import entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderStatusDao {
    @Select(value = "select state_type from orders where order_id = #{order_id}")
    Orders getorderstate(@Param("order_id")String order_id);
}
