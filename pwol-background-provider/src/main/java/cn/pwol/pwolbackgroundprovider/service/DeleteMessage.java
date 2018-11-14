package cn.pwol.pwolbackgroundprovider.service;

import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import sun.plugin2.message.Message;
import sun.rmi.transport.Channel;

public interface DeleteMessage {
    void DeleteTickeInfoMessag(Ticketinfo ticketinfo, Message message,Channel channel);
    void DeleteBannerInfoMessag(Bannerinfo bannerinfo, Message message,Channel channel);
}
