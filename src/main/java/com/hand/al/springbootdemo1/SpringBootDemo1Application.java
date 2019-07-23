package com.hand.al.springbootdemo1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@ServletComponentScan
@SpringBootApplication
@MapperScan("com.hand.al.springbootdemo1.mapper")
public class SpringBootDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo1Application.class, args);
    }
}
