package cn.pwol.pwolsearchprovider.es;

import cn.pwol.pwolsearchprovider.mapping.SearchMapper;
import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.SearchPageInfo;
import cn.pwol.pwolsearchprovider.pojo.TheaterInfo;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;
import cn.pwol.pwolsearchprovider.service.SearchService;
import cn.pwol.pwolsearchprovider.util.PageInfoUtil;
import com.alibaba.fastjson.JSON;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class ElasticsearchUtil {

    @Autowired
    ESAuctionGoodsDao goodsDao;
    @Autowired
    private SearchMapper sm;

    public String query(Integer page, Integer size, String queryGoods) {
        System.out.println(page);
        System.out.println(size);
        System.out.println(queryGoods);
        page = page != null && page > 1 ? page - 1 : 0;
        size = size != null && size > 0 ? size : 20;
        PageInfoUtil<SearchPageInfo> pageInfo = null;
        if (null != queryGoods && !"".equals(queryGoods)) {
            List<SearchPageInfo> goodsESList = new ArrayList<>();
            QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryGoods);
            int totalPages = goodsDao.search(builder, new PageRequest(0, size)).getTotalPages();
            page = page >= totalPages ? totalPages - 1 >= 0 ? totalPages - 1 : totalPages : page;
            Pageable pageable = new PageRequest(page, size);
            Iterable<TicketInfo> search = goodsDao.search(builder, pageable);
            Iterator<TicketInfo> iterator = search.iterator();
            while (iterator.hasNext()) {
                TicketInfo next = iterator.next();
                Integer ticketid = next.getTicketid();
                Integer theaterfk = next.getTheaterfk();
                TheaterInfo theaterInfo = sm.gettheaterInfo(theaterfk);
                SKUInfo firstDate = sm.getFirstDate(ticketid);
                SKUInfo lastDate = sm.getLastDate(ticketid);
                SKUInfo minTicketPrice = sm.getMinTicketPrice(ticketid);
                SKUInfo maxTicketPrice = sm.getMaxTicketPrice(ticketid);
                String min = String.valueOf(minTicketPrice.getPrice());
                String max = String.valueOf(maxTicketPrice.getPrice());
                Date firstshowdate = firstDate.getShowdate();
                Date lastshowdate = lastDate.getShowdate();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                String startDate = sdf.format(firstshowdate);
                String endDate = sdf.format(lastshowdate);
                SearchPageInfo spi = new SearchPageInfo();
                spi.setSpticketid(ticketid);
                spi.setCity(next.getCity());
                spi.setDescription(next.getDescription());
                spi.setStarttime(startDate);
                spi.setEndtime(endDate);
                spi.setMinprice(min);
                spi.setMaxprice(max);
                spi.setPirurl(next.getPicurl());
                spi.setShowplace(theaterInfo.getTheatername());
                spi.setTicketstatus(next.getStatus());
                spi.setTitle(next.getTitle());
                goodsESList.add(spi);
            }
            //分页数据
            pageInfo = new PageInfoUtil<>(page + 1, totalPages,goodsESList);
        }
        return JSON.toJSONString(pageInfo);
    }

}
