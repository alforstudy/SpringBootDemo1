package com.hand.al.springbootdemo1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource("classpath:config.properties")
public class MyConfig {
    @Value("${com.hand.author}")
    private String author;

    @Value("${com.hand.appName}")
    public String appName;

    @Value("${com.hand.yeyu.phone}")
    private String phone;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
