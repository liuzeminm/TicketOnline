package vo;

/**
 * 订单列表实体类
 */
public class OrdersTransfer {

    // 订单编号
    private String order_id;

    // 票务信息
    private String order_commotity;

    // 座位信息
    private String seat_info;

    // 票务数目
    private int tickets_num;

    // 订单金额
    private String order_money;

    // 订单状态
    private String order_state;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_commotity() {
        return order_commotity;
    }

    public void setOrder_commotity(String order_commotity) {
        this.order_commotity = order_commotity;
    }

    public int getTickets_num() {
        return tickets_num;
    }

    public void setTickets_num(int tickets_num) {
        this.tickets_num = tickets_num;
    }

    public String getOrder_money() {
        return order_money;
    }

    public void setOrder_money(String order_money) {
        this.order_money = order_money;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }
    public String getSeat_info() {
        return seat_info;
    }

    public void setSeat_info(String seat_info) {
        this.seat_info = seat_info;
    }
}
