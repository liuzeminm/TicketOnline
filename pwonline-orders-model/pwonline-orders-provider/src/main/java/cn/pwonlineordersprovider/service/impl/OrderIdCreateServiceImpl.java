package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersconsumer.controller.PerInfoController;
import cn.pwonlineordersconsumer.controller.TicketInfoController;
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
    @Autowired
    private PerInfoController perInfoController;

    // 获取商品属性参数
    @Autowired
    private TicketInfoController ticketInfoController;

    @Override
    public String getOrderId(String username){
        String createtime = createTimeService.dateprovideString();
        String result = null;
        if (createtime.length() == 3){
            result = "创建订单编号失败";
        }else {
            // 个人账号前四位
            String getpersoninfo = perInfoController.getperinfo(username).substring(0,4);
            // 票务账号前四位
            String getgoodsinfo = ticketInfoController.getticketinfo().substring(0,4);
            // 四位随机数
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
