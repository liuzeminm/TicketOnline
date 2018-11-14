package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.SearchInventoryDao;
import cn.pwonlineordersprovider.service.GetTicketInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTicketInventoryImpl implements GetTicketInventory {
    @Autowired
    private SearchInventoryDao searchInventoryDao;

    @Override
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
