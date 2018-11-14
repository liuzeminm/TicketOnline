package cn.pwol.pwolbackgroundprovider.pojo;

public class Bannerinfo {
    private Integer bannerid;

    private String bannerurl;

    private String bannertype;

    private String bannercity;

    private Integer ticketfk;

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

    public String getBannertype() {
        return bannertype;
    }

    public void setBannertype(String bannertype) {
        this.bannertype = bannertype == null ? null : bannertype.trim();
    }

    public String getBannercity() {
        return bannercity;
    }

    public void setBannercity(String bannercity) {
        this.bannercity = bannercity == null ? null : bannercity.trim();
    }

    public Integer getTicketfk() {
        return ticketfk;
    }

    public void setTicketfk(Integer ticketfk) {
        this.ticketfk = ticketfk;
    }
}