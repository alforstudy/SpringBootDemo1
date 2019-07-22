package com.hand.al.springbootdemo1.pojo;


public class Department {

    private Long id;

    private String dep_name;

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
