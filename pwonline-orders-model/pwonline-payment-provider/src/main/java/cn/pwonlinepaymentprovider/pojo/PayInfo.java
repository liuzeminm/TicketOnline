package cn.pwonlinepaymentprovider.pojo;

/**
 * 支付记录类
 */
public class PayInfo {
    private int id = 0;
    private String pay_id; //支付宝交易订单
    private String pay_order_id; //商家订单号
    private String pay_money; //付款金额

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public String getPay_order_id() {
        return pay_order_id;
    }

    public void setPay_order_id(String pay_order_id) {
        this.pay_order_id = pay_order_id;
    }

    public String getPay_money() {
        return pay_money;
    }

    public void setPay_money(String pay_money) {
        this.pay_money = pay_money;
    }
}
