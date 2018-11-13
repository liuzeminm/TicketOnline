package cn.pwol.pwolbackgroundprovider.service.impl;

import cn.pwol.pwolbackgroundprovider.config.DalyConfig;
import cn.pwol.pwolbackgroundprovider.mappin.BannerinfoMapper;
import cn.pwol.pwolbackgroundprovider.mappin.TicketinfoMapper;
import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import cn.pwol.pwolbackgroundprovider.service.DeleteMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Message;
import sun.rmi.runtime.Log;
import sun.rmi.transport.Channel;
@Service
@Slf4j
public class DelectMessageImpl implements DeleteMessage {

    @Autowired
    private BannerinfoMapper bannerinfoMapper;
    @Autowired
    private TicketinfoMapper ticketinfoMapper;
    @Override
    @RabbitListener(queues = {DalyConfig.USER_QUERY})
    public void DeleteTickeInfoMessag(Ticketinfo ticketinfo, Message message, Channel channel) {
        Integer ticketid = ticketinfo.getTicketid();
        try {
            if (ticketid != null) {
                int selectOneStste = ticketinfoMapper.selectOneStste(ticketid);
                if (selectOneStste != 0){
                    ticketinfoMapper.deleteByPrimaryKey(ticketid);
                }
            }
        }catch (Exception e){

        }



    }

    @Override
    @RabbitListener(queues = {DalyConfig.USER_QUERY})
    public void DeleteBannerInfoMessag(Bannerinfo bannerinfo, Message message, Channel channel) {
        Integer bannerid = bannerinfo.getBannerid();
        try {
            if (bannerid != null){
                int selectOneStste = bannerinfoMapper.selectOneStste(bannerid);
                if (selectOneStste != 0){
                    bannerinfoMapper.deleteByPrimaryKey(bannerid);
                }
            }
        }catch (Exception e){
        }


    }
}
