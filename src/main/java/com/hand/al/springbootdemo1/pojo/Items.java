package com.hand.al.springbootdemo1.pojo;


import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Repository
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String detail;
    private String pic;
    private Date createtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


    public java.util.Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(java.util.Date createtime) {
        this.createtime = createtime;
    }

}
