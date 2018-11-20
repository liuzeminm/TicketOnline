package cn.pwonlineordersconsumer.service;

import cn.pwonlineordersconsumer.hystrix.ServerBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 新增购票人信息
 */
@FeignClient(value = "",fallback = ServerBackFactory.class)
public interface AddBuyerInfoService {
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String addbuyerinfo(String buyerinfo);
}