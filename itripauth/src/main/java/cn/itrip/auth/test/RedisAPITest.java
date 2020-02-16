package cn.itrip.auth.test;


import cn.itrip.common.RedisAPI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class RedisAPITest {
    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
        RedisAPI api = (RedisAPI) atx.getBean("redisAPI");
        api.set("idxz","wuwuuw2");

      /*  assertEquals("xiaoming",api.exist("name"));
        assertEquals(true,api.exist("name"));*/

    }
}
