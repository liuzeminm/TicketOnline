package cn.pwol.pwolshowcomsumer.pojo;

public class SeatInfo {
    private Integer seatid;
    private Integer floor;
    private String stand;
    private String grade;
    private String seat;
    private Integer ticketprice;
    private String seatstatus;
    private Integer skufk;
    private Integer theaterticketfk;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Integer getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(Integer ticketprice) {
        this.ticketprice = ticketprice;
    }

    public String getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(String seatstatus) {
        this.seatstatus = seatstatus;
    }

    public Integer getSkufk() {
        return skufk;
    }

    public void setSkufk(Integer skufk) {
        this.skufk = skufk;
    }

    public Integer getTheaterticketfk() {
        return theaterticketfk;
    }

    public void setTheaterticketfk(Integer theaterticketfk) {
        this.theaterticketfk = theaterticketfk;
    }
}