package cn.pwonlinepaymentprovider.dao;


import cn.pwonlinepaymentprovider.pojo.PayInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 支付记录dao接口
 */
@Repository
@Mapper
public interface PayDao {
    @Insert(value = "INSERT INTO payment(pay_id,pay_order_id,pay_money) VALUES(#{p.pay_id},#{p.pay_order_id},#{p.pay_money})")
    int  addInfo(@Param("p") PayInfo payInfo);
}
