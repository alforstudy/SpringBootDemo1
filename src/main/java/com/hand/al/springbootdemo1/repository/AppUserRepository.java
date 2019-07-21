package com.hand.al.springbootdemo1.repository;

import com.hand.al.springbootdemo1.pojo.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    public List<AppUser> findAppUsersByUsername(String username);

    public List<AppUser> findAppUsersByUsernameLikeAndPhone(String username,String phone);
}
