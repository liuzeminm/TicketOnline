package cn.pwol.pwolsearchprovider.es;


import cn.pwol.pwolsearchprovider.pojo.SearchPageInfo;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ESAuctionGoodsDao extends ElasticsearchRepository<TicketInfo,Long>,PagingAndSortingRepository<TicketInfo,Long>{}
