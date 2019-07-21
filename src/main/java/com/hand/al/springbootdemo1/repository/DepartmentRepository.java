package com.hand.al.springbootdemo1.repository;

import com.hand.al.springbootdemo1.pojo.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
