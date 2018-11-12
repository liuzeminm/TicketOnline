package enu;

/**
 * 个人状态
 */
public enum PersonalState {
    PER_NO_PAY(1,"未支付"),
    PER_DONE_PAY(2,"已支付"),
    PER_NO_PROCEEDS(3,"未收款"),
    PER_DONE_PROCEEDS(4,"已收款"),
    PER_NO_RETURN_GOODS(5,"未退货"),
    PER_DONE_RETURN_GOODS(6,"已退货");
    private int stateid;
    private String statetype;
    // 私有构造
    private PersonalState(int stateid,String statetype){
        this.stateid=stateid;
        this.statetype=statetype;
    }
    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getStatetype() {
        return statetype;
    }

    public void setStatetype(String statetype) {
        this.statetype = statetype;
    }
}
