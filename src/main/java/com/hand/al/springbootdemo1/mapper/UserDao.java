package com.hand.al.springbootdemo1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.hand.al.springbootdemo1.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    User findUserById(Long id);
    List<User> findUserByUsernameAndSex(Map map);
}
