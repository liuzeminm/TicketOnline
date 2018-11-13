package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.service.CreateOrdersService;
import com.alibaba.fastjson.JSON;
import entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OrdersController {
    @Autowired
    private CreateOrdersService createOrdersService;
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    public String createOrders(Orders orders){
        String createservice = createOrdersService.createservice(orders);
        return JSON.toJSONString(createservice);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
