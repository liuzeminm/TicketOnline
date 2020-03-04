package cn.pwol.pwolbackgroundprovider.service.impl;

import cn.pwol.pwolbackgroundprovider.config.DelayConfig;
import cn.pwol.pwolbackgroundprovider.dao.BannerinfoMapper;
import cn.pwol.pwolbackgroundprovider.dao.TicketinfoMapper;
import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import cn.pwol.pwolbackgroundprovider.service.DeleteMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Message;
import sun.rmi.transport.Channel;
@Service
@Slf4j
public class DeleteMessageImpl implements DeleteMessage {

    @Autowired
    private BannerinfoMapper bannerinfoMapper;
    @Autowired
    private TicketinfoMapper ticketinfoMapper;
    @Override
    @RabbitListener(queues = {DelayConfig.USER_QUERY})
    public void DeleteTickeInfoMessag(Ticketinfo ticketinfo, Message message, Channel channel) {
        Integer ticketId = ticketinfo.getTicketid();
        try {
            if (ticketId != null) {
                int selectOneStste = ticketinfoMapper.selectOneStste(ticketId);
                if (selectOneStste != 0){
                    ticketinfoMapper.deleteByPrimaryKey(ticketId);
                }
            }
        }catch (Exception e){

        }



    }

    @Override
    @RabbitListener(queues = {DelayConfig.USER_QUERY})
    public void DeleteBannerInfoMessag(Bannerinfo bannerinfo, Message message, Channel channel) {
        Integer bannerId = bannerinfo.getBannerid();
        try {
            if (bannerId != null){
                int selectOneStste = bannerinfoMapper.selectOneStste(bannerId);
                if (selectOneStste != 0){
                    bannerinfoMapper.deleteByPrimaryKey(bannerId);
                }
            }
        }catch (Exception e){
        }


    }
}
