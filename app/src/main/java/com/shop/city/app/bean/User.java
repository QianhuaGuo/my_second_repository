package com.shop.city.app.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String name;
    private Integer age;

    private Date birth;

//    public User(String name,Integer
//                     age){
//        this.name = name;
//        this.age = age;
//    }
}
