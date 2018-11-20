package entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * (Orders)表实体类
 *
 * @author makejava
 * @since 2018-11-03 14:22:38
 */
public class Orders implements Serializable {
    //订单序列号
    private Integer id;
    //订单编号
    private String orderId;
    //订单消费者编号
    private String orderPersonalId;
    //订单商户编号
    private String orderSellerId;
    //订单状态
    private Integer orderStateId;
    //订单消费者状态编号
    private Integer orderPersonalstateId;
    //订单商家状态编号
    private Integer orderSellstateId;
    //订单创建时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderCreateTime;
    //订单对应商品编号
    private String orderCommotity;
    //订单配送
    private Integer orderDeliveryId;
    //订单完成时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderFinishTime;
    //订单支付时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderChargeTime;
    //商品发货时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderDelstartTime;
    //订单收获时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderDelreciveTime;
    //订单退货时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderGoodsreturnTime;
    //订单退款时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date orderRefundTime;

    //空白列
    private String blankB;
    //空白列
    private String blankC;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderPersonalId() {
        return orderPersonalId;
    }

    public void setOrderPersonalId(String orderPersonalId) {
        this.orderPersonalId = orderPersonalId;
    }

    public String getOrderSellerId() {
        return orderSellerId;
    }

    public void setOrderSellerId(String orderSellerId) {
        this.orderSellerId = orderSellerId;
    }

    public Integer getOrderStateId() {
        return orderStateId;
    }

    public void setOrderStateId(Integer orderStateId) {
        this.orderStateId = orderStateId;
    }

    public Integer getOrderPersonalstateId() {
        return orderPersonalstateId;
    }

    public void setOrderPersonalstateId(Integer orderPersonalstateId) {
        this.orderPersonalstateId = orderPersonalstateId;
    }

    public Integer getOrderSellstateId() {
        return orderSellstateId;
    }

    public void setOrderSellstateId(Integer orderSellstateId) {
        this.orderSellstateId = orderSellstateId;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderCommotity() {
        return orderCommotity;
    }

    public void setOrderCommotity(String orderCommotity) {
        this.orderCommotity = orderCommotity;
    }

    public Integer getOrderDeliveryId() {
        return orderDeliveryId;
    }

    public void setOrderDeliveryId(Integer orderDeliveryId) {
        this.orderDeliveryId = orderDeliveryId;
    }

    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public Date getOrderChargeTime() {
        return orderChargeTime;
    }

    public void setOrderChargeTime(Date orderChargeTime) {
        this.orderChargeTime = orderChargeTime;
    }

    public Date getOrderDelstartTime() {
        return orderDelstartTime;
    }

    public void setOrderDelstartTime(Date orderDelstartTime) {
        this.orderDelstartTime = orderDelstartTime;
    }

    public Date getOrderDelreciveTime() {
        return orderDelreciveTime;
    }

    public void setOrderDelreciveTime(Date orderDelreciveTime) {
        this.orderDelreciveTime = orderDelreciveTime;
    }

    public Date getOrderGoodsreturnTime() {
        return orderGoodsreturnTime;
    }

    public void setOrderGoodsreturnTime(Date orderGoodsreturnTime) {
        this.orderGoodsreturnTime = orderGoodsreturnTime;
    }

    public Date getOrderRefundTime() {
        return orderRefundTime;
    }

    public void setOrderRefundTime(Date orderRefundTime) {
        this.orderRefundTime = orderRefundTime;
    }

    public String getBlankB() {
        return blankB;
    }

    public void setBlankB(String blankB) {
        this.blankB = blankB;
    }

    public String getBlankC() {
        return blankC;
    }

    public void setBlankC(String blankC) {
        this.blankC = blankC;
    }

}