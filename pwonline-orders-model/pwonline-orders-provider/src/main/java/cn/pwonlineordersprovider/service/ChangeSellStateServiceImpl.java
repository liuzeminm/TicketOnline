package cn.pwonlineordersprovider.service;

import cn.pwonlineordersprovider.dao.ChangeSellStateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static enu.SellState.*;

@RestController
public class ChangeSellStateServiceImpl {
    @Autowired
    private ChangeSellStateDao changeSellStateDao;
    @RequestMapping(value = "changesellstate",method = RequestMethod.PUT)
    public String changesellstateservice(String orderid,String sellid){
        int sellids = Integer.parseInt(sellid);
        int changesellstatedao = changeSellStateDao.changesellstatedao(orderid, sellids);
        String result = null;
        if (changesellstatedao == 1){
            if (sellids == SELL_NO_OUTGO.getSellstateid()){
                result = "商家状态:" + SELL_NO_OUTGO.getSellstatetype();
            }else if (sellids == SELL_DONE_OUTGO.getSellstateid()){
                result = "商家状态:" + SELL_DONE_OUTGO.getSellstatetype();
            }else if (sellids == SELL_NO_REFUND.getSellstateid()){
                result = "商家状态:" + SELL_NO_REFUND.getSellstatetype();
            }else if (sellids == SELL_DONE_RERUND.getSellstateid()){
                result = "商家状态:" + SELL_DONE_RERUND.getSellstatetype();
            }else if (sellids == SELL_NO_RECIVE.getSellstateid()){
                result = "商家状态:" + SELL_NO_RECIVE.getSellstatetype();
            }else if (sellids == SELL_DONE_RECIVE.getSellstateid()){
                result = "商家状态:" + SELL_DONE_RECIVE.getSellstatetype();
            }else {
                result =  "商家状态异常!";
            }
        }else {
            result = "商家状态修改失败！";
        }
        return  result;
    }
}
