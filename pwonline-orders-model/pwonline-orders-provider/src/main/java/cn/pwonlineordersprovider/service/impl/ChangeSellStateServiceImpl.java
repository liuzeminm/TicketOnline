package cn.pwonlineordersprovider.service.impl;

import cn.pwonlineordersprovider.dao.OrdersDao;
import cn.pwonlineordersprovider.service.ChangeSellStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.SellState.*;

/**
 *
 * 修改商家状态
 */
@Service
public class ChangeSellStateServiceImpl implements ChangeSellStateService {
    @Autowired
    private OrdersDao changeSellStateDao;
    @Override
    public String changesellstateservice(String orderid,String sellid){
        int sellids = Integer.parseInt(sellid);
        int changesellstatedao = changeSellStateDao.changesellstatedao(orderid, sellids);
        String result = null;
        if (changesellstatedao == 1){
            switch (sellids){
                case 1:
                    result = "商家状态:" + SELL_NONE.getSellstatetype();
                    break;
                case 2:
                    result = "商家状态:" + SELL_NO_OUTGO.getSellstatetype();
                    break;
                case 3:
                    result = "商家状态:" + SELL_DONE_OUTGO.getSellstatetype();
                    break;
                case 4:
                    result = "商家状态:" + SELL_NO_REFUND.getSellstatetype();
                    break;
                case 5:
                    result = "商家状态:" + SELL_DONE_RERUND.getSellstatetype();
                    break;
                case 6:
                    result = "商家状态:" + SELL_NO_RECIVE.getSellstatetype();
                    break;
                case 7:
                    result = "商家状态:" + SELL_DONE_RECIVE.getSellstatetype();
                    break;
                default:
                    result = "商家状态修改异常！";
                    break;
            }
        }else {
            result = "商家状态修改失败！";
        }
        return  result;
    }
}
