package cn.pwol.pwolshowproducer.pojo;

import java.util.Date;

public class SKUInfo {
    private Integer skuid;

    private Date showdate;

    private Double price;

    private Integer ticketfk;

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public Date getShowdate() {
        return showdate;
    }

    public void setShowdate(Date showdate) {
        this.showdate = showdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price ;
    }

    public Integer getTicketfk() {
        return ticketfk;
    }

    public void setTicketfk(Integer ticketfk) {
        this.ticketfk = ticketfk;
    }
}