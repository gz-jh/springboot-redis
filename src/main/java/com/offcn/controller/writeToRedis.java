package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class writeToRedis {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("write")
    public String write(){
        redisTemplate.boundValueOps("888").set("啦啦撸啊咧,我要开飞机 ");
        String msg= (String)redisTemplate.boundValueOps("888").get();
        return msg;
    }
}
