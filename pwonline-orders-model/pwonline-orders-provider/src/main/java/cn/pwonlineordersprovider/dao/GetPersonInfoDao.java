package cn.pwonlineordersprovider.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 通过前台传递的个人账户名获取个人账户涉及订单相关信息
 */
@Repository
@Mapper
public interface GetPersonInfoDao {
    @Insert(value = "")
    Object getInfodao(@Param("username") String username);
}
