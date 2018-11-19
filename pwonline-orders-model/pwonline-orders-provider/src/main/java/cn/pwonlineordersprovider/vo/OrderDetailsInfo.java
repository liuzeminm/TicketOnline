package cn.pwonlineordersprovider.vo;

import java.util.Date;

/**
 * 订单详情实体类
 */
public class OrderDetailsInfo {
    // 订单编号
    private String order_id;
    // 订单状态
    private String order_state;
    // 交易金额
    private String order_money;
    // 票务信息
    private String tickets_info;
    // 座位信息
    private String seat_info;
    // 票务单价
    private String ticket_single_money;
    // 票务数量
    private int tickets_num;
    // 订单优惠
    private String discounts;
    // 配送信息
    private String delvery_info;
    // 订单创建时间
    private Date create_time;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getOrder_money() {
        return order_money;
    }

    public void setOrder_money(String order_money) {
        this.order_money = order_money;
    }

    public String getTickets_info() {
        return tickets_info;
    }

    public void setTickets_info(String tickets_info) {
        this.tickets_info = tickets_info;
    }

    public String getSeat_info() {
        return seat_info;
    }

    public void setSeat_info(String seat_info) {
        this.seat_info = seat_info;
    }

    public String getTicket_single_money() {
        return ticket_single_money;
    }

    public void setTicket_single_money(String ticket_single_money) {
        this.ticket_single_money = ticket_single_money;
    }

    public int getTickets_num() {
        return tickets_num;
    }

    public void setTickets_num(int tickets_num) {
        this.tickets_num = tickets_num;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public String getDelvery_info() {
        return delvery_info;
    }

    public void setDelvery_info(String delvery_info) {
        this.delvery_info = delvery_info;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
