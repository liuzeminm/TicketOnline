package cn.pwonlineordersprovider.service;


import java.text.ParseException;
import java.util.Date;

/**
 * 当前时间接口
 */
public interface CurrentTimeService {
    public String dateprovideString();
    public Date dateprovideDate() throws ParseException;
}
