package cn.pwol.pwolbackgroundprovider.service;

import cn.pwol.pwolbackgroundprovider.pojo.Seatinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Skuinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;

public interface UpDateTheaterInforMation {
    int upDateskuinfo(Skuinfo skuinfo);
    int upDateseatinfo(Seatinfo seatinfo);
    int upDateTicketInfo(Ticketinfo ticketinfo);

}
