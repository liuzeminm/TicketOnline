package cn.pwonlinepaymentprovider.service;

import cn.pwonlinepaymentprovider.dao.PayDao;
import cn.pwonlinepaymentprovider.pojo.PayInfo;
import cn.pwonlinepaymentprovider.util.AlipayConfig;
import cn.pwonlinepaymentprovider.util.RabbitSender;
import cn.pwonlinepaymentprovider.util.RequestParams;
import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service
public class Return_url {
    @Resource
    private PayDao payDao;
    @Resource
    private RabbitSender rabbitSender;

    public PayDao getPayDao() {
        return payDao;
    }

    public void setPayDao(PayDao payDao) {
        this.payDao = payDao;
    }

    public void return_url(Map<String,String[]> requestParams, String out_trade_no, String trade_no, String total_amount){
        //获取支付宝GET过来反馈信息
        Map<String,String> params = RequestParams.requestParams(requestParams);
        boolean signVerified = false;
        //调用SDK验证签名
        try {
            signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
           /*
           //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            */
            PayInfo payInf = new PayInfo();
            payInf.setPay_id(out_trade_no);
            payInf.setPay_money(total_amount);
            payInf.setPay_order_id(out_trade_no);
            payDao.addInfo(payInf);
            rabbitSender.sendSeckillPayrQueue(out_trade_no);
        }
        //——请在这里编写您的程序（以上代码仅作参考）——
    }
}
