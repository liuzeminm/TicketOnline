package enu;

/**
 * 商家状态
 */
public enum SellState {
    SELL_NONE(1,"无"),
    SELL_NO_OUTGO(2,"未出货"),
    SELL_DONE_OUTGO(3,"已出货"),
    SELL_NO_REFUND(4,"未退款"),
    SELL_DONE_RERUND(5,"已退款"),
    SELL_NO_RECIVE(6,"未收货"),
    SELL_DONE_RECIVE(7,"已收货");
    private int sellstateid;
    private String sellstatetype;
    // 私有构造
    private SellState(int sellstateid,String sellstatetype){
        this.sellstateid = sellstateid;
        this.sellstatetype = sellstatetype;
    }
    public int getSellstateid() {
        return sellstateid;
    }

    public void setSellstateid(int sellstateid) {
        this.sellstateid = sellstateid;
    }

    public String getSellstatetype() {
        return sellstatetype;
    }

    public void setSellstatetype(String sellstatetype) {
        this.sellstatetype = sellstatetype;
    }
}
