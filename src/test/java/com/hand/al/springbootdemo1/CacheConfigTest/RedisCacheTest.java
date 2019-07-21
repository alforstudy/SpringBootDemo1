package com.hand.al.springbootdemo1.CacheConfigTest;

import com.hand.al.springbootdemo1.pojo.AppUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void RedisCacheTest1() {
        stringRedisTemplate.opsForValue().set("app","SpringBoot");
        Assert.assertEquals("SpringBoot",stringRedisTemplate.opsForValue().get("app"));
    }

    @Test
    public void RedisCacheTest2() throws InterruptedException {
        AppUser appUser = new AppUser();
        appUser.setId(123L);
        appUser.setPhone("110");
        appUser.setUsername("安磊");

        ValueOperations<String,AppUser> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("com.hand.al",appUser);
        valueOperations.set("com.hand.al.1",appUser,1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        Boolean hasKey = redisTemplate.hasKey("com.hand.al.1");
        if(hasKey){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
