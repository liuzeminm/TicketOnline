package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SearchInventoryDao {
    // 通过前台拿到的票务信息去验证票是否已经售出
    @Select(value = "select ")
    Object getTicketInfo(@Param("ticketseat")String ticketseat);
}
