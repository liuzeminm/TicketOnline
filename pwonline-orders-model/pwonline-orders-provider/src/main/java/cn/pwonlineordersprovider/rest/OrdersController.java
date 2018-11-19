package cn.pwonlineordersprovider.rest;

import cn.pwonlineordersprovider.service.CreateOrdersService;
import cn.pwonlineordersprovider.service.OrderDetailsShowService;
import cn.pwonlineordersprovider.service.OrdersShowService;
import cn.pwonlineordersprovider.vo.OrdersTransfer;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Orders;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
@Api(value="/test", tags="订单模块测试")
public class OrdersController {
    // 订单列表展示
    @Autowired
    private OrdersShowService ordersShowService;
    // 订单详情展示
    @Autowired
    private OrderDetailsShowService orderDetailsShowService;


    @ApiOperation(value="查看订单列表", notes = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "per_id",value = "个人账户ID",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "index",value = "当前页",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "pagesize",value = "页面数",dataType = "String",paramType = "query")
    })
    @RequestMapping(value = "ordersshow",method = RequestMethod.POST)
    public String ordershow(@RequestParam("per_id") String per_id, @RequestParam("index") String index, @RequestParam("pagesize") String pagesize){
        int indexs = Integer.parseInt(index);
        int pagesizes = Integer.parseInt(pagesize);
        PageHelper.startPage(indexs,pagesizes);
        List<OrdersTransfer> getordersshowservice = ordersShowService.getordersshowservice(per_id);
        PageInfo page = new PageInfo(getordersshowservice,pagesizes);
        return JSON.toJSONString(page);
    }
    // 订单详情展示
    @ApiOperation(value="查看具体订单详情", notes = "详情查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "per_id",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "ordersshow",method = RequestMethod.POST)
    public String orderinfo(@RequestParam("order_id") String order_id){
        String orderdetailsshowservice = orderDetailsShowService.orderdetailsshowservice(order_id);
        return JSON.toJSONString(orderdetailsshowservice);
    }


    // 创建订单
    @Autowired
    private CreateOrdersService createOrdersService;
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    public String createOrders(String per_username,Orders orders){
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
