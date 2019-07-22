package com.hand.al.springbootdemo1.action;

import com.hand.al.springbootdemo1.config.MyConfig2;
import com.hand.al.springbootdemo1.mapper.AppUserMapper;
import com.hand.al.springbootdemo1.pojo.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private MyConfig2 myConfig;

    @Autowired
    private AppUserMapper appUserMapper;

    @GetMapping
    public List<AppUser> list(){
        List<AppUser> all = null;
        all = appUserMapper.listAppUser("dept_id");
        return all;
    }

    @GetMapping("/{id}")
    public AppUser query(@PathVariable("id") Long id){
        AppUser appUser = appUserMapper.findUserById(id);
        return appUser;
    }

    @GetMapping("/2/{id}")
    public Object query2(@PathVariable("id") Long id){
        HashMap<String, Object> map = appUserMapper.findUserById2(id);
        return map;
    }


    @PostMapping
    public AppUser create(@RequestBody AppUser user) {
        //影响的行数
        Long rows = appUserMapper.insetAppUser(user);
        return user;
    }

    @PostMapping("2")
    public AppUser create2(@RequestBody AppUser user) {
        //影响的行数
        appUserMapper.saveAppUser(user);
        return user;
    }

    @PutMapping("{id}")
    public AppUser update(@PathVariable("id") Long id,@RequestBody AppUser user){
        AppUser appUser = appUserMapper.updateAppUser(user);
        return appUser;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        appUserMapper.deleteAppUser(id);
    }

    @PostMapping("/")
    public List<AppUser> listByOptions(@RequestBody Map<String, Object> options) throws NoSuchMethodException {
        Optional<Map<String, Object>> optional = Optional.ofNullable(options);
        List<AppUser> list = null;
        String qmethod =  (String) optional.map(o -> o.get("qmethod")).orElse("");
        switch (qmethod){
            case "findAppUsersByUsername" :
//                list = appUserRepository.findAppUsersByUsername((String) optional.map(o -> o.get("username")).orElse(""));
                break;
            case "findAppUsersByUsernameLikeAndPhone":
            {
                String username = (String)optional.map(o->o.get("username")).orElse("");
                String phone = (String)optional.map(o->o.get("phone")).orElse("");
//                list = appUserRepository.findAppUsersByUsernameLikeAndPhone(username,phone);
                break;
            }

        }
        return list;
    }
}
