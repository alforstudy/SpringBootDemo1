package com.hand.al.springbootdemo1.action;

import com.hand.al.springbootdemo1.config.MyConfig2;
import com.hand.al.springbootdemo1.mapper.AppUserMapper;
import com.hand.al.springbootdemo1.pojo.AppUser;
import com.hand.al.springbootdemo1.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private MyConfig2 myConfig;

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private AppUserMapper appUserMapper;

    @GetMapping
    public List<AppUser> list(){
        List<AppUser> all = appUserRepository.findAll();
        return all;
    }

    @GetMapping("/{id}")
    public AppUser query(@PathVariable("id") String id){
        Optional<AppUser> appUser = appUserRepository.findById(Long.valueOf(id));
        return appUser.orElse(null);
    }

    @GetMapping("2/{id}")
    public AppUser query2(@PathVariable("id") Long id){
        AppUser appUser = appUserMapper.findUserById(id);
        return appUser;
    }

    @PostMapping
    public AppUser create(@RequestBody AppUser user) {
        AppUser save_user = appUserRepository.save(user);
        return save_user;
    }

    @PutMapping("{id}")
    public AppUser update(@PathVariable("id") Long id,@RequestBody AppUser user){
        AppUser appUser = appUserRepository.saveAndFlush(user);
        return appUser;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        appUserRepository.deleteById(id);
    }

    @PostMapping("/")
    public List<AppUser> listByOptions(@RequestBody Map<String, Object> options) throws NoSuchMethodException {
        Optional<Map<String, Object>> optional = Optional.ofNullable(options);
        List<AppUser> list = null;
        String qmethod =  (String) optional.map(o -> o.get("qmethod")).orElse("");
        switch (qmethod){
            case "findAppUsersByUsername" :
                list = appUserRepository.findAppUsersByUsername((String) optional.map(o -> o.get("username")).orElse(""));
                break;
            case "findAppUsersByUsernameLikeAndPhone":
            {
                String username = (String)optional.map(o->o.get("username")).orElse("");
                String phone = (String)optional.map(o->o.get("phone")).orElse("");
                list = appUserRepository.findAppUsersByUsernameLikeAndPhone(username,phone);
                break;
            }

        }
        return list;
    }
}
