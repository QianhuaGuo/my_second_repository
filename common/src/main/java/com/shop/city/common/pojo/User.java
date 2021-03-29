package com.shop.city.common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String userName;
    private Integer age;
    private Integer studentId;
    private Date birth;
}
