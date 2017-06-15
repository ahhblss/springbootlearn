package com.lss.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sean.liu on 2017/6/15.
 */
@RestController
@RequestMapping("/redis")
public class RedisDemoController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/simplesave/{key}/{value}")
    public String saveKey(HttpServletRequest request, @PathVariable("key") String key,@PathVariable("value") String value){

        stringRedisTemplate.opsForValue().set(key,value);

        System.out.println("save success");

        stringRedisTemplate.delete(key);

        return  "from redis :"+stringRedisTemplate.opsForValue().get(key);

    }
}
