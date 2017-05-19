package com.lss.springboot.controller;

import com.lss.springboot.service.helloworld.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sean.liu on 2017/4/14.
 */
@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    String hello() {
        return helloWorldService.say("hello world hhhh ");
    }
}
