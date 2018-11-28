package cn.pwol.pwolshowcomsumer.pojo;

import org.springframework.stereotype.Component;

@Component
public class BannerInfo {
    private Integer bannerid;

    private String bannerurl;

    private Integer ticketfk;

    private String bannercity;

    private String bannertype;

    public Integer getBannerid() {
        return bannerid;
    }

    public void setBannerid(Integer bannerid) {
        this.bannerid = bannerid;
    }

    public String getBannerurl() {
        return bannerurl;
    }

    public void setBannerurl(String bannerurl) {
        this.bannerurl = bannerurl == null ? null : bannerurl.trim();
    }

    public Integer getTicketfk() {
        return ticketfk;
    }

    public void setTicketfk(Integer ticketfk) {
        this.ticketfk = ticketfk;
    }

    public String getBannercity() {
        return bannercity;
    }

    public void setBannercity(String bannercity) {
        this.bannercity = bannercity;
    }

    public String getBannertype() {
        return bannertype;
    }

    public void setBannertype(String bannertype) {
        this.bannertype = bannertype;
    }
}