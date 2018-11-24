package cn.pwonlineordersprovider.dao;


import entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
    List<Orders> getAll(@Param("personal_id") String personal_id);

    // 订单具体详情表
    Orders getOne(@Param("order_id") String order_id);

    // 新建订单
    int addorders(@Param("o") Orders o);

    // 订单取消
    int cancleordersdao(@Param("orderid") String orderid);

    // 修改订单状态
    int changeordersstatusdao(@Param("orderstateid")int orderstateid,@Param("orderid") String orderid);

    // 修改订单用户状态
    int changePerStatusdao(@Param("orderid") String orderid,@Param("perstatusid") int perstatusid);

    // 修改订单商家状态
    int changesellstatedao(@Param("orderid") String orderid, @Param("sellid") int sellid);




}