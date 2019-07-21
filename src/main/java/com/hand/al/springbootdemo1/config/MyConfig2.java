package com.hand.al.springbootdemo1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="com.hand",ignoreUnknownFields = true)
public class MyConfig2 {
    private String author;

    private String appName;

    @Value("${com.hand.yeyu.phone}")
//    @Value("${yeyu.phone}")
    private String phone;
    //如果key找不到就会报错,使用@Value注解必须写全key

    //多级的话也可以使用内部类的方式来解析
    //如果是多级那么 这个属性一定要提供set方法
    private Yeyu yeyu = new Yeyu();
    public static class Yeyu{
        private String phone;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhone2() {
        return yeyu.getPhone();
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setYeyu(Yeyu yeyu) {
        this.yeyu = yeyu;
    }
}
