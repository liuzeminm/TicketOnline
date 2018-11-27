package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.SearchInventoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTicketInventoryServiceImpl{
    @Autowired
    private SearchInventoryDao searchInventoryDao;
    @RequestMapping(value = "getticketinventory",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String getticketInventory(String ticketinfo, String ticketseat) {
        Object ticketInfo = searchInventoryDao.getTicketInfo(ticketseat);
        // 判断订单状态
        if (ticketInfo.equals("")){
            //座位存在
            return "座位存在！";
        }else {
            // 座位不存在
            return "座位不存在！";
        }
    }
}
