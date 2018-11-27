package cn.pwonlineordersconsumer.feigin.orders;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.util.Date;

/**
 * 当前时间接口
 */
@FeignClient(value = "pwonline-orders-provider")
public interface CurrentTimeService {
    @RequestMapping(value = "StringdateProvide", method = RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public String dateprovideString();

    @RequestMapping(value = "DateProvide",method = RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public Date dateprovideDate();
}
