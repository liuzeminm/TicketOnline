package cn.pwol.pwolsearchprovider.controller;

import cn.pwol.pwolsearchprovider.es.ElasticsearchUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSearchContorller {
    @Autowired
    private ElasticsearchUtil eu;
    @RequestMapping(value = "/showTicketSearchResult",method = RequestMethod.POST)
    public String getInfos(@Param("page") Integer page,@Param("size") Integer size,@Param("queryGoods") String queryGoods){
        return eu.query(page,size,queryGoods);
    }
}
