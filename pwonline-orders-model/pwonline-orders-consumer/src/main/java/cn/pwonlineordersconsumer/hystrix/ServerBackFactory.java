/*
package cn.pwonlineordersconsumer.hystrix;

import cn.pwonlineordersconsumer.feigin.person.*;
import cn.pwonlineordersconsumer.feigin.ticket.GetTicketInfoService;
import cn.pwonlineordersconsumer.feigin.ticket.GetTicketInventoryService;
import cn.pwonlineordersconsumer.feigin.ticket.LockoffTicketInventoryService;
import cn.pwonlineordersconsumer.feigin.ticket.LockonTicketInventoryService;
import org.springframework.stereotype.Component;

*/
/**
 * 熔断
 *//*

@Component
public class ServerBackFactory implements AddBuyerInfoService, AddPerAddressService, LockonTicketInventoryService, DelBuyerInfoService, LockoffTicketInventoryService, GetPerInfoService, GetPeronalIdService, GetTicketInfoService, GetTicketInventoryService, UpdatePerAddressService {
    // 添加购票人信息
    @Override
    public String addbuyerinfo(String buyerinfo) {
        return "Hystrix:添加购票人异常！";
    }
    // 添加个人地址
    @Override
    public String addperaddress(String addressinfo) {
        return "Hystrix:添加地址异常！";
    }
    // 释放座位锁定
    @Override
    public String lockoffticketinventory(String seatinfo) {
        return "Hystrix:释放座位锁定异常！";
    }
    // 删除购票人信息
    @Override
    public String delbuyerinfo(String buyerusername) {
        return "Hystrix:删除购票人信息异常！";
    }
    // 锁定座位
    @Override
    public String lockonticketinventory(String seatinfo) {
        return "Hystrix:锁定座位异常！";
    }
    // 获取购票人信息
    @Override
    public String getperinfo(String perusername) {
        return "Hystrix:获取购票人信息异常！";
    }
    // 获取用户名
    @Override
    public String getusername(String username) {
        return "Hystrix:获取用户名异常！";
    }
    // 获取票务信息
    @Override
    public String getticketinfo() {
        return "Hystrix:获取票务信息异常！";
    }
    // 获取座位信息
    @Override
    public String getticketinventory(String ticketinfo) {
        return "Hystrix:获取座位信息异常！";
    }
    // 修改用户地址
    @Override
    public String updateperaddress(String addressinfo) {
        return "Hystrix:获取用户地址异常！";
    }
}
*/
