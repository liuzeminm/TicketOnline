package cn.pwol.pwolsearchprovider.pojo;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;


@Component
public class SearchPageInfo {
    private Integer spticketid;
    private String city;
    private String pirurl;
    private String title;
    private String minprice;
    private String maxprice;
    private String starttime;
    private String endtime;
    private String showplace;
    private String description;
    private String ticketstatus;

    public Integer getSpticketid() {
        return spticketid;
    }

    public void setSpticketid(Integer spticketid) {
        this.spticketid = spticketid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPirurl() {
        return pirurl;
    }

    public void setPirurl(String pirurl) {
        this.pirurl = pirurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMinprice() {
        return minprice;
    }

    public void setMinprice(String minprice) {
        this.minprice = minprice;
    }

    public String getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(String maxprice) {
        this.maxprice = maxprice;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getShowplace() {
        return showplace;
    }

    public void setShowplace(String showplace) {
        this.showplace = showplace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTicketstatus() {
        return ticketstatus;
    }

    public void setTicketstatus(String ticketstatus) {
        this.ticketstatus = ticketstatus;
    }
}
