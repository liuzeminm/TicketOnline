package cn.pwol.pwolbackgroundprovider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PwolBackgroundProviderApplicationTests {

    @Test
    public void contextLoads() {
        for (int i = 0 ; 0 < 50 ; i++) {
            System.out.println(i);
        }
    }

}
