package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface OrderStateDao {
    // 查询订单状态
    @Select(value = "select state_type from order_state where state_id =#{id}")
    String getAll(@Param("id") int id);

}