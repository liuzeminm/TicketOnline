package cn.pwol.pwolbackgroundprovider.pojo;

import java.util.Date;

public class Skuinfo {
    private Integer skuid;

    private Date date;

    private String price;

    private Integer seatfk;

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getSeatfk() {
        return seatfk;
    }

    public void setSeatfk(Integer seatfk) {
        this.seatfk = seatfk;
    }
}