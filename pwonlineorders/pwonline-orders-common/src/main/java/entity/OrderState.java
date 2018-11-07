package entity;


/**
 * (OrderState)表实体类
 *
 * @author makejava
 * @since 2018-11-07 11:04:47
 */
public class OrderState {
    //订单状态编号
    private Integer stateId;
    //订单状态类型
    private String stateType;


    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

}