package cn.pwonlineordersprovider.dao;


import entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

import static sql.SqlCommons.SQL_COMMON;

/**
 * (Orders)表数据库访问层
 *
 * @author makejava
 * @since 2018-11-03 14:22:38
 */
@Repository
@Mapper
public interface OrdersDao {
    // 个人详情页订单列表
    @Select(value = "select" + SQL_COMMON + "from orders where" +
            "order_personal_id=#{personal_id}")
    List<Orders> getAll(@Param("personal_id") String personal_id);

    // 订单具体详情表
    @Select(value = "select" + SQL_COMMON + "from orders where " +
            "order_id=#{order_id}")
    Orders getOne(@Param("order_id") String order_id);

}