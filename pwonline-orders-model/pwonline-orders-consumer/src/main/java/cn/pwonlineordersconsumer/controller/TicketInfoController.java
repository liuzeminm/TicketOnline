/*
package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.feigin.ticket.GetTicketInfoService;
import cn.pwonlineordersconsumer.feigin.ticket.GetTicketInventoryService;
import cn.pwonlineordersconsumer.feigin.ticket.LockoffTicketInventoryService;
import cn.pwonlineordersconsumer.feigin.ticket.LockonTicketInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * 票务信息相关
 *//*

@RestController()
@RequestMapping(value = "ticketinfo",method = RequestMethod.POST)
public class TicketInfoController {
    // 释放库存
    @Autowired
    private LockoffTicketInventoryService lockoffticketinventory;
    @RequestMapping(value = "/lockoffticket")
    public String backticketinvventory(String seatinfo){
        return lockoffticketinventory.lockoffticketinventory(seatinfo);
    }
    // 锁定库存
    @Autowired
    private LockonTicketInventoryService lockonTicketInventoryService;
    @RequestMapping(value = "/lockonticket")
    public String lockonticketinventory(String seatinfo){
        return lockonTicketInventoryService.lockonticketinventory(seatinfo);
    }
    // 获取库存信息
    @Autowired
    private GetTicketInventoryService getTicketInventoryService;
    @RequestMapping(value = "/getticketinventory")
    public String getticketinventory(String ticketinfo){
        return getTicketInventoryService.getticketinventory(ticketinfo);
    }
    // 获取票务信息
    @Autowired
    private GetTicketInfoService getTicketInfoService;
    @RequestMapping(value = "/getticketinfo")
    public String getticketinfo(){
        return getTicketInfoService.getticketinfo();
    }
}
*/
