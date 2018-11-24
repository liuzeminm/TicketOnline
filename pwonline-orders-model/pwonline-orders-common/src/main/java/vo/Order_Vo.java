package vo;

import io.swagger.annotations.ApiModel;

/**
 * 订单中间层，供业务逻辑服务
 */
@ApiModel(value="Order_Vo对象",description="用户对象user")
public class Order_Vo {
    // 订单编号
    private String order_id;
    // 用户名
    private String per_username;
    // 票务信息
    private String ticket_info;
    // 订单状态(未支付、已取消、待出货、待收货、已收货、待退款、已退款、未退货、已退货)
    private String order_state;
    // 用户状态(未支付、已支付、未收款、已收款、未退货、已退货)
    private String per_state;
    // 商家状态(无、未出货、已出货、未退款、已退款、未收货、已收货)
    private String sell_state;
    // 订单创建时间
    private String order_create_time;
    // 座位信息
    private String commodity_info;
    // 物流编号
    private String deliver_id;
    // 订单完成时间
    private String order_finish_time;
    // 订单支付时间
    private String order_charge_time;
    // 订单发货时间
    private String order_delstart_time;
    // 订单收获时间
    private String order_delrecive_time;
    // 订单退款时间
    private String order_refund_time;
    // 订单退货时间
    private String order_goodreturn_time;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPer_username() {
        return per_username;
    }

    public void setPer_username(String per_username) {
        this.per_username = per_username;
    }

    public String getTicket_info() {
        return ticket_info;
    }

    public void setTicket_info(String ticket_info) {
        this.ticket_info = ticket_info;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getPer_state() {
        return per_state;
    }

    public void setPer_state(String per_state) {
        this.per_state = per_state;
    }

    public String getSell_state() {
        return sell_state;
    }

    public void setSell_state(String sell_state) {
        this.sell_state = sell_state;
    }

    public String getOrder_create_time() {
        return order_create_time;
    }

    public void setOrder_create_time(String order_create_time) {
        this.order_create_time = order_create_time;
    }

    public String getCommodity_info() {
        return commodity_info;
    }

    public void setCommodity_info(String commodity_info) {
        this.commodity_info = commodity_info;
    }

    public String getDeliver_id() {
        return deliver_id;
    }

    public void setDeliver_id(String deliver_id) {
        this.deliver_id = deliver_id;
    }

    public String getOrder_finish_time() {
        return order_finish_time;
    }

    public void setOrder_finish_time(String order_finish_time) {
        this.order_finish_time = order_finish_time;
    }

    public String getOrder_charge_time() {
        return order_charge_time;
    }

    public void setOrder_charge_time(String order_charge_time) {
        this.order_charge_time = order_charge_time;
    }

    public String getOrder_delstart_time() {
        return order_delstart_time;
    }

    public void setOrder_delstart_time(String order_delstart_time) {
        this.order_delstart_time = order_delstart_time;
    }

    public String getOrder_delrecive_time() {
        return order_delrecive_time;
    }

    public void setOrder_delrecive_time(String order_delrecive_time) {
        this.order_delrecive_time = order_delrecive_time;
    }

    public String getOrder_refund_time() {
        return order_refund_time;
    }

    public void setOrder_refund_time(String order_refund_time) {
        this.order_refund_time = order_refund_time;
    }

    public String getOrder_goodreturn_time() {
        return order_goodreturn_time;
    }

    public void setOrder_goodreturn_time(String order_goodreturn_time) {
        this.order_goodreturn_time = order_goodreturn_time;
    }
}
