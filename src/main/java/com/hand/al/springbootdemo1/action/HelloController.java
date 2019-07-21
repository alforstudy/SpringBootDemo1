package com.hand.al.springbootdemo1.action;

import com.hand.al.springbootdemo1.pojo.AppUser;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","123");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/test_cache")
    @Cacheable("user-key")
    public AppUser user(){
        AppUser appUser = new AppUser();
        appUser.setId(123L);
        appUser.setPhone("110");
        appUser.setUsername("安磊");
        System.out.println("这句话使用来测试缓存的");
        return appUser;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession httpSession){
        Object id = httpSession.getAttribute("id");
        if(id == null){
            Random random = new Random();
            id = random.nextInt();
        }
        httpSession.setAttribute("id",id);
        return "index";
    }
}
