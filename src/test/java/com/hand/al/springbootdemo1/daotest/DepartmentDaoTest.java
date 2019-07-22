package com.hand.al.springbootdemo1.daotest;

import com.hand.al.springbootdemo1.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentDaoTest {


    @Test
    public void testSave(){
        Department department = new Department();
        department.setDep_name("hand");
        department.setDep_phone("123456");
//        departmentRepository.save(department);
    }
}
