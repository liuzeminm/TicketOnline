package enu;

/**
 * 订单状态
 */
public enum OrderState {
    OR_NO_CHARGE(1,"未支付"),
    OR_CANCLE(2,"已取消"),
    OR_NO_OUTGO(3,"待出货"),
    OR_NO_RECIVE(4,"待收货"),
    OR_DONE_RECIVE(5,"已收货"),
    OR_NO_REFUND(6,"待退款"),
    OR_DONE_REFUND(7,"已退款"),
    OR_NO_RETURN_GOODS(8,"未退货"),
    OR_DONE_RETURN_GOODS(9,"已退货");
    private int orderstateid;
    private String orderstatetype;
    // 私有构造
    private OrderState(int orderstateid,String orderstatetype){
        this.orderstateid = orderstateid;
        this.orderstatetype = orderstatetype;
    }
    public int getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(int orderstateid) {
        this.orderstateid = orderstateid;
    }

    public String getOrderstatetype() {
        return orderstatetype;
    }

    public void setOrderstatetype(String orderstatetype) {
        this.orderstatetype = orderstatetype;
    }
}
