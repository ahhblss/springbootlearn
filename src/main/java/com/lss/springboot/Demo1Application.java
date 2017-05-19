package com.lss.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootApplication //->@Configuration @EnableAutoConfiguration @ComponentScan
//@EnableAutoConfiguration
public class Demo1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Demo1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
}
