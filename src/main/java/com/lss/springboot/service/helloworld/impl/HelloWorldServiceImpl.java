package com.lss.springboot.service.helloworld.impl;

import com.lss.springboot.service.helloworld.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by Sean.liu on 2017/4/14.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String say(String msg) {
        return msg;
    }
}
