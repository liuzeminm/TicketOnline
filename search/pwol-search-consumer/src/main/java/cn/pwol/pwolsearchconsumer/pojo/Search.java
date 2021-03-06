package cn.pwol.pwolsearchconsumer.pojo;


import org.springframework.stereotype.Component;

@Component
public class Search {
    private Integer searchid;
    private TicketInfo ti;
    private SKUInfo sk;

    public Integer getSearchid() {
        return searchid;
    }

    public void setSearchid(Integer searchid) {
        this.searchid = searchid;
    }

    public TicketInfo getTi() {
        return ti;
    }

    public void setTi(TicketInfo ti) {
        this.ti = ti;
    }

    public SKUInfo getSk() {
        return sk;
    }

    public void setSk(SKUInfo sk) {
        this.sk = sk;
    }
}
