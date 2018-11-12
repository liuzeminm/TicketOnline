package cn.pwonlineordersprovider.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CurrentTimeServiceImpl {
    @RequestMapping(value = "dateProvide", method = RequestMethod.GET)
    public String dateprovide() {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return df.format(new Date());
    }
}
