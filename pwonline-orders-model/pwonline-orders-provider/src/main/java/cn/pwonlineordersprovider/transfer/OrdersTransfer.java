package cn.pwonlineordersprovider.transfer;

/**
 * 订单列表实体类
 */
public class OrdersTransfer {
    private String order_id;
    private String order_sell_info;
    private String order_commotity;
    private Double order_money;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_sell_info() {
        return order_sell_info;
    }

    public void setOrder_sell_info(String order_sell_info) {
        this.order_sell_info = order_sell_info;
    }

    public String getOrder_commotity() {
        return order_commotity;
    }

    public void setOrder_commotity(String order_commotity) {
        this.order_commotity = order_commotity;
    }

    public Double getOrder_money() {
        return order_money;
    }

    public void setOrder_money(Double order_money) {
        this.order_money = order_money;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    private String order_state;

}
