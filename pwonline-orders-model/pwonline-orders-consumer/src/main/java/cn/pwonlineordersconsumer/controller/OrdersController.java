package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.feigin.CreateOrdersService;
import cn.pwonlineordersconsumer.feigin.orders.*;
import io.swagger.annotations.*;
import vo.Order_Vo;
import vo.OrdersTransfer;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.ParseException;
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
            @ApiImplicitParam(name = "order_id",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "orderdetailshow",method = RequestMethod.POST)
    public String orderinfo(@RequestParam("order_id") String order_id){
        String orderdetailsshowservice = orderDetailsShowService.orderdetailsshowservice(order_id);
        return JSON.toJSONString(orderdetailsshowservice);
    }


    // 创建订单
    @Autowired
    private CreateOrdersService createOrdersService;
    @RequestMapping(value = "createorders",method = RequestMethod.POST)
    @ApiOperation(value="创建订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "per_username",value = "个人账户",dataType = "String",paramType = "query"),
    })
    public String createOrders(String per_username,@RequestBody @ApiParam(name = "订单创建",value = "订单参数动态设定",required = true) Order_Vo order_vo) throws ParseException {
        String sessionid = "555";
        System.out.println(order_vo.getCommodity_info());
        String createservice = createOrdersService.createservice(sessionid,per_username,order_vo);
        return JSON.toJSONString(createservice);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
    // 修改订单状态
    @Autowired
    private ChangeOrdersStatusService changeOrdersStatusService;
    @RequestMapping(value = "changeorderstatus",method = RequestMethod.POST)
    @ApiOperation(value = "修改订单状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "status",value = "订单状态(1未支付,2已取消,3待出货,4待收货,5已收货,6待退款,7已退款,8未退货,9已退货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "order_id",value = "订单ID",dataType = "String",paramType = "query"),
    })
    public String changeordersstatus(@RequestParam("status") String status,@RequestParam("order_id") String order_id){
        int state = Integer.parseInt(status);
        String changeordersstaus = changeOrdersStatusService.changeordersstaus(state, order_id);
        return JSON.toJSONString(changeordersstaus);
    }
    // 修改用户状态
    @Autowired
    private ChangePerStatusService changePerStatusService ;
    @RequestMapping(value = "changeperstatus",method = RequestMethod.POST)
    @ApiOperation(value = "修改用户状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "perstatusid",value = "用户状态(1未支付,2已支付,3未收款,4已收款,5未退货,6已退货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderid",value = "订单ID",dataType = "String",paramType = "query"),
    })
    public String changeperstatus(@RequestParam("orderid") String orderid,@RequestParam("perstatusid") String perstatusid){
        int perstate = Integer.parseInt(perstatusid);
        String changeordersstaus = changeOrdersStatusService.changeordersstaus(perstate, orderid);
        return JSON.toJSONString(changeordersstaus);
    }

    // 修改商家状态
    @Autowired
    private ChangeSellStateService changeSellStateService;
    @RequestMapping(value = "changesellstate",method = RequestMethod.POST)
    @ApiOperation(value = "修改商家状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sellid",value = "商家状态(1无,2未出货,3已出货,4未退款,5已退款,6未收货,7已收货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderid",value = "订单ID",dataType = "String",paramType = "query"),
    })
    public String changeselstate(@RequestParam("orderid") String orderid,@RequestParam("sellid") String sellid){
        String changesellstateservice = changeSellStateService.changesellstateservice(orderid, sellid);
        return JSON.toJSONString(changesellstateservice);
    }
}
