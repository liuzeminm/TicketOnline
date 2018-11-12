package cn.pwol.pwolbackgroundprovider.service;

import cn.pwol.pwolbackgroundprovider.pojo.*;

import java.util.List;

public interface AddTheaterInformation {
    /**
     * 添加影院信息
     * @param ticketinfo
     * @return 成功或者失败
     */
    boolean AddTheaterInformation(Ticketinfo ticketinfo);

    /**
     * 添加商品sku
     * @param skuinfo
     * @return 返回成或者失败
     */
    boolean AddSku(Skuinfo skuinfo);

    /**
     * 添加剧场座位信息
     * @param seatinfo
     * @return 返回成功或者失败
     */
    boolean AddSeatInformation(Seatinfo seatinfo);

    /**
     * 添加图片信息
     * @param bannerinfo
     * @return 返回成功或者失败
     */
    boolean AddBannerinfo(Bannerinfo bannerinfo);

    /**
     * 添加支持
     * @param supportinfo
     * @return 返回成功或者失败
     */
    boolean Addsupportinfo(Supportinfo supportinfo);
    //boolean AddMessage(Ticketinfo ticketinfo, List<Skuinfo> skuinfoList, List<Seatinfo> seatinfoList, Bannerinfo bannerinfo, Supportinfo supportinfo);
}
