package com.example.pwonlineorderscreatetimeprovider.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CreateTimeServiceImpl {
    @RequestMapping(value = "dateProvide",method = RequestMethod.GET)
    public String dateprovide(){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
