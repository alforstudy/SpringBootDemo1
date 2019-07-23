package com.hand.al.springbootdemo1.pojo;


import java.util.List;

public class Orders {

    private Long id;
    private Long userId;
    private String number;
    private java.util.Date createtime;
    private String note;
    private User user;
    private List<Orderdetail> orderdetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public java.util.Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(java.util.Date createtime) {
        this.createtime = createtime;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }
}
