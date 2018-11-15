package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.service.CancleOrderService;
import cn.pwonlineordersprovider.service.CurrentTimeService;
import cn.pwonlineordersprovider.service.OrderIdCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 订单编号创建实现类
 * 订单编号由个人账户前4位 + 当前商品编号前4位 + 当前时间3-9位 + 4位随机数构成
 */
@Service
public class OrderIdCreateServiceImpl implements OrderIdCreateService {
    // 获取当前时间
    @Autowired
    private CurrentTimeService createTimeService;
    // 获取当前账户信息
    public String getPersonInfo() {
        return "55555555555";
    }
    // 获取商品属性参数
    public String getGoodsInfo() {
        return "12345678";
    }
    @Override
    public String getOrderId(){
        String createtime = createTimeService.dateprovide();
        String result = null;
        if (createtime.length()==3){
            result = "创建订单编号失败";
        }else {
            String getpersoninfo = getPersonInfo().substring(0,4);
            String getgoodsinfo = getGoodsInfo().substring(0,4);
            String str="0123456789";
            StringBuilder sb=new StringBuilder(4);
            for(int i=0;i<4;i++) {
                char ch=str.charAt(new Random().nextInt(str.length()));
                sb.append(ch);
            }
            result = getpersoninfo + getgoodsinfo + createtime.substring(2,8) + sb;
        }
        return result;
    }

}
