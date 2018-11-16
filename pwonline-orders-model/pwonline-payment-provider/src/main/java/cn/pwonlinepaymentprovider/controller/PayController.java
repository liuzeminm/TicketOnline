package cn.pwonlinepaymentprovider.controller;


import cn.pwonlinepaymentprovider.service.Pay;
import cn.pwonlinepaymentprovider.service.Refund;
import cn.pwonlinepaymentprovider.service.RefundQuery;
import cn.pwonlinepaymentprovider.service.Return_url;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class PayController {
    @Resource
    private Pay pay;
    @Resource
    private Return_url return_url;
    @Resource
    private Refund refund;
    @Resource
    private RefundQuery refundQuery;
    /**
     * 支付
     * @param order_number 订单号
     * @param money 金额
     * @param order_name 订单名字
     * @param order_id 订单id
     * @return
     */
    @RequestMapping(name = "payment-pay",method = RequestMethod.GET,produces = "text/json;charset=UTF-8")
    public  String pay(@RequestParam String order_number,@RequestParam String money,@RequestParam String order_name,@RequestParam String order_id){
        return  pay.pay(order_number,money,order_name,null,order_id);
    }

    /**
     * 支付回调
     * @param out_trade_no
     * @param trade_no
     * @param total_amount
     * @param request
     * @return
     */
    @RequestMapping(value = "return_url",method = RequestMethod.GET,produces = "text/json; charset=utf-8")
    public void alipayReturn_url(@RequestParam String out_trade_no,@RequestParam String trade_no,@RequestParam String total_amount,@RequestParam HttpServletRequest request) {
        Map<String, String[]> requestParams = request.getParameterMap();
        return_url.return_url(requestParams,out_trade_no,trade_no,total_amount);

    }

    /**
     * 退款
     * @param WIDTRout_trade_no //商户订单号，商户网站订单系统中 该金额不能大于订单金额，必填
     * @return
     */
    @RequestMapping(value = "refund",method = RequestMethod.POST,produces = "text/html; charset=utf-8")
    public String refund(@RequestParam String WIDTRout_trade_no,@RequestParam String WIDTRrefund_amount) {
        String s = refund.refund(WIDTRout_trade_no, null,WIDTRrefund_amount,null,null);
        return s;
    }

    /**
     * 退款回调
     * @param WIDRQout_trade_no
     * @param WIDRQtrade_no
     * @param WIDRQout_request_no
     * @return
     */
    @RequestMapping(value = "refundQuery",method = RequestMethod.POST,produces = "text/html; charset=utf-8")
    public void refundQuery(@RequestParam String WIDRQout_trade_no,@RequestParam String WIDRQtrade_no,@RequestParam String WIDRQout_request_no) {
         refundQuery.refundQuery(WIDRQout_trade_no,WIDRQtrade_no,WIDRQout_request_no);
    }
}
