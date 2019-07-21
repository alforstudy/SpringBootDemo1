package com.hand.al.springbootdemo1.pojo;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String dep_name;

    @Column(name = "phone")
    private String dep_phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_phone() {
        return dep_phone;
    }

    public void setDep_phone(String dep_phone) {
        this.dep_phone = dep_phone;
    }
}
