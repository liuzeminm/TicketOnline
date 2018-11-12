package enu;

/**
 * 性别
 */
public enum Sex {
    NAN(1,"男"),NV(2,"女");
    private int stateid;
    private String sex;
    // 私有构造
    private Sex(int stateid,String sex){
        this.stateid=stateid;
        this.sex=sex;
    }
    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
