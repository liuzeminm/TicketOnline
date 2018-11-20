package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ServerBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 修改用户地址信息
 */
@FeignClient(value = "",fallback = ServerBackFactory.class)
public interface UpdatePerAddressService {
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String updateperaddress(String addressinfo);
}
