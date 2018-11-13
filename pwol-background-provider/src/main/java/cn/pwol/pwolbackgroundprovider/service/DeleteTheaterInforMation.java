package cn.pwol.pwolbackgroundprovider.service;

import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import org.apache.ibatis.annotations.Delete;

public interface DeleteTheaterInforMation {
    int DeleteTickeInfo (Ticketinfo ticketinfo);
    int DeleteBannerInfo (Bannerinfo bannerinfo);
}
