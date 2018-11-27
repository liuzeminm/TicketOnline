package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.service.CurrentTimeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@RestController
@RequestMapping(value = "dateprovide")
public class CurrentTimeServiceImpl implements CurrentTimeService {
    @RequestMapping(value = "stringdate", method = RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public String dateprovideString() {
        //设置日期格式String
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return df.format(new Date());
    }
    @RequestMapping(value = "datedate",method = RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public Date dateprovideDate() throws ParseException {
        //设置日期格式Date
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        Date utildate = df.parse(time);
        return utildate;
    }
}
