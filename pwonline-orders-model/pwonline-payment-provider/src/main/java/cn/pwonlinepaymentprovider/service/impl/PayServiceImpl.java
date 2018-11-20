package cn.pwonlinepaymentprovider.service.impl;

import cn.pwonlinepaymentprovider.dao.PayDao;
import cn.pwonlinepaymentprovider.pojo.PayInfo;
import cn.pwonlinepaymentprovider.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付实现类
 */
@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayDao pd;

    @Override
    public String payService(PayInfo payInfo) {
        String result = null;
        int i = pd.addInfo(payInfo);
        if (i == 1){
            result = "支付记录添加成功！";
        }else {
            result = "支付记录添加失败！";
        }
        return result;
    }
}
