package cn.pwol.pwolsearchprovider.service;

import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.Search;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;

public interface SearchService {
    String getTicketInfo(TicketInfo ti, SKUInfo sk,int index);
    String getTicketNumber(TicketInfo ti, SKUInfo sk);

}
