package com.example.pwonlineordersstatusprovider.dao.service.impl;

import com.example.pwonlineordersstatusprovider.dao.OrderStateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderStateServiceImpl {
    @Autowired
    private OrderStateDao orderStateDao;
    @RequestMapping(value = "ordersStatusProvider",method = RequestMethod.POST)
    public String show(@RequestParam("id") int id){
        return orderStateDao.getAll(id);
    }
}
