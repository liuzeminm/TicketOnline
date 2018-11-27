package cn.pwonlineordersconsumer.controller;

import cn.pwonlineordersconsumer.service.CreateOrdersService;
import cn.pwonlineordersconsumer.feigin.orders.*;
import cn.pwonlineordersconsumer.service.OrderInfoService;
import cn.pwonlineordersconsumer.service.OrdersShow;
import io.swagger.annotations.*;
import vo.Order_Vo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/order")
@Api(value="/test", tags="订单模块测试")
public class OrdersController {
    // 订单列表展示
    @Autowired
    private OrdersShow ordersShow;
    // 订单详情展示
    @Autowired
    private OrderInfoService orderInfoService;
    // 创建订单
    @Autowired
    private CreateOrdersService createOrdersService;
    // 取消订单
    @Autowired
    private CancleOrderService cancleOrderService;
    // 修改订单状态
    @Autowired
    private ChangeOrdersStatusService changeOrdersStatusService;
    // 修改用户状态
    @Autowired
    private ChangePerStatusService changePerStatusService ;
    // 修改商家状态
    @Autowired
    private ChangeSellStateService changeSellStateService;
    /**
     * 个人信息页订单管理列表(分页查询)
     * @param per_id
     * @param index
     * @param pagesize
     * @return
     */
    @ApiOperation(value="查看订单列表", notes = "分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "per_id",value = "个人账户ID",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "index",value = "当前页",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "pagesize",value = "页面数",dataType = "String",paramType = "query")
    })
    @RequestMapping(value = "ordersshow",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String ordershow(@RequestParam("per_id") String per_id, @RequestParam("index") String index, @RequestParam("pagesize") String pagesize){
        int indexs = Integer.parseInt(index);
        int pagesizes = Integer.parseInt(pagesize);
        return ordersShow.ordersshow(per_id, indexs, pagesizes);
    }

    /**
     * 具体订单详情查询
     * @param order_id
     * @return
     */
    @ApiOperation(value="查看具体订单详情", notes = "详情查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "order_id",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "orderdetailshow",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String orderinfo(@RequestParam("order_id") String order_id){
        return orderInfoService.orderInfo(order_id);
    }


    /**
     * 创建订单
     * 获取到用户用户名和票务对应信息完成订单的初步创建
     * Order_Vo为前台传到后台的过渡实体类，不直接对应数据库，通过中转再持久化到对应订单数据库中
     * @param per_username
     * @param order_vo
     * @return
     * @throws ParseException
     */
    @ApiOperation(value="创建订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "per_username",value = "个人账户",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "createorders",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
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

    /**
     * 取消订单
     * 取消订单常用于用户长时间未支付完成，自动修改订单状态为已取消
     * @param orderId
     * @return
     */
    @ApiOperation(value="取消订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "cancleorder",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String cancleOrder(@RequestParam("orderId") String orderId){
        String s = cancleOrderService.cancleOrdersService(orderId);
        return JSON.toJSONString(s);
    }
    /**
     * 修改订单状态
     * 根据用户和商家的状态结合考虑修改订单的状态
     * 1未支付,2已取消,3待出货,4待收货,5已收货,6待退款,7已退款,8未退货,9已退货
     * @param status
     * @param order_id
     * @return
     */
    @ApiOperation(value = "修改订单状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "status",value = "订单状态(1未支付,2已取消,3待出货,4待收货,5已收货,6待退款,7已退款,8未退货,9已退货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "order_id",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "changeorderstatus",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String changeordersstatus(@RequestParam("status") String status,@RequestParam("order_id") String order_id){
        int state = Integer.parseInt(status);
        String changeordersstaus = changeOrdersStatusService.changeordersstaus(state, order_id);
        System.out.println(changeordersstaus);
        return JSON.toJSONString(changeordersstaus);
    }



    /**
     * 修改用户状态
     * 根据订单完成情况、以及用户的状态修改对应的用户状态
     * 1未支付,2已支付,3未收款,4已收款,5未退货,6已退货
     * @param orderid
     * @param perstatusid
     * @return
     */
    @ApiOperation(value = "修改用户状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "perstatusid",value = "用户状态(1未支付,2已支付,3未收款,4已收款,5未退货,6已退货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderid",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "changeperstatus",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String changeperstatus(@RequestParam("orderid") String orderid,@RequestParam("perstatusid") String perstatusid){
        int perstate = Integer.parseInt(perstatusid);
        String changeordersstaus = changePerStatusService.changepersstatusservice(orderid,perstate);
        return JSON.toJSONString(changeordersstaus);
    }




    /**
     * 修改商家状态
     * 根据对应用户的支付情况、退换货情况进行相应修改
     * 1无,2未出货,3已出货,4未退款,5已退款,6未收货,7已收货
     * @param orderid
     * @param sellid
     * @return
     */
    @ApiOperation(value = "修改商家状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sellid",value = "商家状态(1无,2未出货,3已出货,4未退款,5已退款,6未收货,7已收货)",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderid",value = "订单ID",dataType = "String",paramType = "query"),
    })
    @RequestMapping(value = "changesellstate",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String changeselstate(@RequestParam("orderid") String orderid,@RequestParam("sellid") String sellid){
        String changesellstateservice = changeSellStateService.changesellstateservice(orderid, sellid);
        return JSON.toJSONString(changesellstateservice);
    }
}
