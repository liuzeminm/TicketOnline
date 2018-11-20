package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.service.CurrentTimeService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class CurrentTimeServiceImpl implements CurrentTimeService {
    @RequestMapping(value = "dateProvide", method = RequestMethod.GET)
    @Override
    public String dateprovideString() {
        //设置日期格式String
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return df.format(new Date());
    }
    @Override
    public Date dateprovideDate() throws ParseException {
        //设置日期格式Date
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        Date utildate = df.parse(time);
        return utildate;
    }
}
