package cn.pwonlineordersconsumer.service.impl;

import cn.pwonlineordersconsumer.service.CurrentTimeService;
import cn.pwonlineordersconsumer.service.OrderIdCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OrderIdCreateServiceImpl implements OrderIdCreateService {
    @Autowired
    private CurrentTimeService createTimeService;
    // 获取当前账户
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
