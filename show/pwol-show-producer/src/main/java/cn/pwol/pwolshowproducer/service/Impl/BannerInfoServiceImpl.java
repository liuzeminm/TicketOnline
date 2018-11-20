package cn.pwol.pwolshowproducer.service.Impl;

import cn.pwol.pwolshowproducer.mapping.BannerInfoMapper;
import cn.pwol.pwolshowproducer.pojo.BannerInfo;
import cn.pwol.pwolshowproducer.service.BannerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BannerInfoServiceImpl implements BannerInfoService {

    @Autowired
    private BannerInfoMapper bim;

    @Override
    public List<BannerInfo> getBanner() {
        return bim.getBanner();
    }

    @Override
    public List<BannerInfo> getBannerByCity(String bannerCity) {
        return bim.getBannerByCity(bannerCity);
    }

    @Override
    public List<BannerInfo> getSportsBanner() {
        return bim.getSportsBanner();
    }
}
