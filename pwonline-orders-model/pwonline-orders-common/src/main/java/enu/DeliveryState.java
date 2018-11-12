package enu;

/**
 * 配送状态
 */
public enum DeliveryState {
    DEL_NO_OUTGO(1,"未发货"),
    DEL_DONE_OUTGO(2,"已发货");
    private int delstateid;
    private String delstatetype;
    // 私有构造
    private DeliveryState(int delstateid,String delstatetype){
        this.delstateid = delstateid;
        this.delstatetype = delstatetype;
    }
    public int getDelstateid() {
        return delstateid;
    }

    public void setDelstateid(int delstateid) {
        this.delstateid = delstateid;
    }

    public String getDelstatetype() {
        return delstatetype;
    }

    public void setDelstatetype(String delstatetype) {
        this.delstatetype = delstatetype;
    }
}
