package org.mvnsearch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * thymeleaf applicaiton test
 *
 * @author linux_china
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ThymeLeafDemoApplicationTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void contextLoads() {
        redisTemplate.boundValueOps("nick").set("Jacky");
        System.out.println("nick:" + redisTemplate.boundValueOps("nick").get());
    }

}
