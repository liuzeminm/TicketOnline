package cn.pwonlineordersprovider.dao;

import entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import static sql.SqlCommons.SQL_CREATE_NEW;

@Repository
@Mapper
public interface CreateOrdersDao {
    // 新建订单
    @Insert(value = "insert into orders("+SQL_CREATE_NEW +") values(#{o.orderId},#{o.orderPersonalId},#{o.orderSellerId},#{o.orderStateId},#{o.orderPersonalstateId},#{o.orderSellstateId},#{o.orderCreateTime},#{o.orderCommotity},#{o.orderDeliveryId},#{o.orderFinishTime},#{o.orderChargeTime},#{o.orderDelstartTime},#{o.orderDelreciveTime})")
    int addorders(@Param("o") Orders orders);
}
