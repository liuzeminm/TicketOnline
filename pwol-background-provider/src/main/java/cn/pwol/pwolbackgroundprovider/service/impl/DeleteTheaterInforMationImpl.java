package cn.pwol.pwolbackgroundprovider.service.impl;

import cn.pwol.pwolbackgroundprovider.config.DelayConfig;
import cn.pwol.pwolbackgroundprovider.config.RabbitSender;
import cn.pwol.pwolbackgroundprovider.dao.BannerinfoMapper;
import cn.pwol.pwolbackgroundprovider.dao.TicketinfoMapper;
import cn.pwol.pwolbackgroundprovider.pojo.Bannerinfo;
import cn.pwol.pwolbackgroundprovider.pojo.Ticketinfo;
import cn.pwol.pwolbackgroundprovider.service.DeleteTheaterInforMation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteTheaterInforMationImpl implements DeleteTheaterInforMation {
    @Autowired
    private RabbitTemplate amqpTemplate;
    @Autowired
    private RabbitSender rabbitSender;
    @Autowired
    private TicketinfoMapper ticketinfoMapper;
    @Autowired
    private BannerinfoMapper bannerinfoMapper;
    @Override
    public int DeleteTickeInfo(Ticketinfo  ticketinfo) {
        if (ticketinfoMapper.updateByPrimaryKeySelective(ticketinfo) == 1){
            this.amqpTemplate.convertAndSend(DelayConfig.DEAD_EXCHANGE, DelayConfig.DEAD_KEY, ticketinfo, message -> {
                message.getMessageProperties().setExpiration(7 * 24 * 60 * 1000 * 60 + "");
                return message;
            });
        }
        return 0;
    }

    @Override
    public int DeleteBannerInfo(Bannerinfo  bannerinfo) {
        int fig = 0;
        if (bannerinfoMapper.updateByPrimaryKeySelective(bannerinfo) == 1){
            this.amqpTemplate.convertAndSend(DelayConfig.DEAD_EXCHANGE, DelayConfig.DEAD_KEY, bannerinfo, message -> {
                message.getMessageProperties().setExpiration(7 * 24 * 60 * 1000 * 60 + "");
                return message;
            });
        }
        return 0;
    }
}
