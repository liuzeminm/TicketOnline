package cn.pwol.pwolshowcomsumer.pojo;

import org.springframework.stereotype.Component;

@Component
public class TicketInfo {
    private Integer ticketid;

    private String city;

    private String category;

    private String subcategory;

    private String showplace;

    private String title;

    private String picurl;

    private String status;

    private String description;

    private Integer zan;

    private Integer supportfk;

    private Integer theaterfk;

    public Integer getTheaterfk() {
        return theaterfk;
    }

    public void setTheaterfk(Integer theaterfk) {
        this.theaterfk = theaterfk;
    }

    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory == null ? null : subcategory.trim();
    }

    public String getShowplace() {
        return showplace;
    }

    public void setShowplace(String showplace) {
        this.showplace = showplace == null ? null : showplace.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public Integer getSupportfk() {
        return supportfk;
    }

    public void setSupportfk(Integer supportfk) {
        this.supportfk = supportfk;
    }
}