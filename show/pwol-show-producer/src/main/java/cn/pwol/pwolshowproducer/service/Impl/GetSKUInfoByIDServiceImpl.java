package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.DetailPageMapper;
import cn.pwol.pwolshowproducer.pojo.DetailPageSKUInfo;
import cn.pwol.pwolshowproducer.pojo.SKUInfo;
import cn.pwol.pwolshowproducer.service.GetSKUInfoByIDService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GetSKUInfoByIDServiceImpl implements GetSKUInfoByIDService {
    @Autowired
    private DetailPageMapper dpm;
    @Override
    public String getSKUInfoByID(int ticketid) {
        List<SKUInfo> skuInfoList = dpm.getSKUInfo(ticketid);
        List<DetailPageSKUInfo> skulist = new ArrayList<DetailPageSKUInfo>();
        for (SKUInfo si:skuInfoList) {
            Date showdate = si.getShowdate();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String sDate=sdf.format(showdate);
            DetailPageSKUInfo dpsi = new DetailPageSKUInfo();
            String price = String.valueOf(si.getPrice());
            dpsi.setPrice(price);
            dpsi.setSkuid(si.getSkuid());
            dpsi.setShowdate(sDate);
            skulist.add(dpsi);
        }
        return JSON.toJSONString(skulist);
    }
}
