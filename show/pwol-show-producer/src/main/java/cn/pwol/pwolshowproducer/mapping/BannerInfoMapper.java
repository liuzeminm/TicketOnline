package cn.pwol.pwolshowproducer.mapping;

import cn.pwol.pwolshowproducer.pojo.BannerInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerInfoMapper {
    /**
     * 查询全国轮播图(首页)
     * @return
     */
    List<BannerInfo> getBanner();

    /**
     * 根据城市名查询轮播图(首页)
     * @param bannerCity 城市名
     * @return
     */
    List<BannerInfo> getBannerByCity(String bannerCity);

    /**
     * 体育频道页面轮播图
     * @return
     */
    List<BannerInfo> getSportsBanner();
}