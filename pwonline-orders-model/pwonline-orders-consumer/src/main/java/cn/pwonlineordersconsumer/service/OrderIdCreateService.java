package cn.pwonlineordersconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 创建订单编号接口
 */
public interface OrderIdCreateService {
    String getOrderId(String username);
}
