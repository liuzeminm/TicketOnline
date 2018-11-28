package cn.pwol.pwolsearchprovider;

import cn.pwol.pwolsearchprovider.pojo.SKUInfo;
import cn.pwol.pwolsearchprovider.pojo.TicketInfo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PwolSearchProviderApplicationTests {

    @Test
    public void contextLoads() {
        TicketInfo ti = new TicketInfo();
        SKUInfo sk = new SKUInfo();
        ti.setCity("北京");
        Map<String,Object> m = new HashMap<String,Object>();
        m.put("TicketInfo",ti);
        m.put("SKUInfo",sk);
        Object o = JSONObject.toJSON(m);
        System.out.println("------------------------------------------------------------------");
        System.out.println(o.toString());
        JSONObject json = new JSONObject(m);
        String s = json.toJSONString();
        System.out.println("------------------------------------------------------------------");
        System.out.println(m);
        System.out.println(s);
    }

}
