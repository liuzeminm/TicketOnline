package cn.pwonlineordersconsumer.feigin.person;

//import cn.pwonlineordersconsumer.hystrix.ServerBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 获取用户信息
 * 需要个人联系方式、地址、购票人信息
 */
/*@FeignClient(value = "",fallback = ServerBackFactory.class)
public interface GetPerInfoService {
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String getperinfo(String perusername);
}*/
