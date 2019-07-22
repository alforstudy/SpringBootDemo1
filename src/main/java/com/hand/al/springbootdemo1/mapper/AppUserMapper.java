package com.hand.al.springbootdemo1.mapper;

import com.hand.al.springbootdemo1.pojo.AppUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface AppUserMapper {
    AppUser findUserById(Long id);

    HashMap<String, Object> findUserById2(Long id);

    Long insetAppUser(AppUser user);

    void saveAppUser(AppUser user);

    AppUser updateAppUser(AppUser user);

    void deleteAppUser(Long id);


    List<AppUser> listAppUser(@Param("column_name") String column_name);

}
