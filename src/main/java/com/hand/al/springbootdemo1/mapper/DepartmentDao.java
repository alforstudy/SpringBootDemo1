package com.hand.al.springbootdemo1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.hand.al.springbootdemo1.pojo.Department;

@Mapper
public interface DepartmentDao {
    int insert(@Param("pojo") Department pojo);

    int insertSelective(@Param("pojo") Department pojo);

    int insertList(@Param("pojos") List<Department> pojo);

    int update(@Param("pojo") Department pojo);
}
