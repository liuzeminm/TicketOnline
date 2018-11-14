package enu;

/**
 * 订单消息
 */
public enum PushInfo {
    PUSH_TO_SELLER_DELIVER("用户已支付成功，请尽快发货！"),
    PUSH_TO_SELLER_REFUND("用户申请退款！"),
    PUSH_TO_SELLER_BACKGOODS("用户申请退货"),
    PUSH_TO_PRO_CHARGED("您的订单下单成功，商家会在尽快发货"),
    PUSH_TO_PRO_DELIVED("您的商品已经发货，请关注物流信息"),
    PUSH_TO_PRO_REFUND("您的退款申请已经发起，请留意信息"),
    PUSH_TO_PRO_BACKGOODS("您的退货申请已经发起，请留意信息");
    private String pushStatus;
    private PushInfo(String pushStatus){
        this.pushStatus = pushStatus;
    }
}
