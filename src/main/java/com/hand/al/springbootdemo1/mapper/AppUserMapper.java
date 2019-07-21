package com.hand.al.springbootdemo1.mapper;

import com.hand.al.springbootdemo1.pojo.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserMapper {
    public AppUser findUserById(Long id);
}
