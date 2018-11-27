package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.dao.OrderStateDao;
import entity.OrderState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderStateServiceImpl {
    @Autowired
    private OrderStateDao orderStateDao;

    @RequestMapping(value = "ordersStatusProvider", method = RequestMethod.POST)
    public String show(@RequestParam("id") int id) {
        OrderState all = orderStateDao.getAll(id);
        return all.getStateType();
    }
}
