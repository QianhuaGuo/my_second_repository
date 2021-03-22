package com.shop.city.common.bean;


import lombok.Data;

/**
 * @Author: Watermelon
 * @Date: 2021/1/27 10:46
 */
@Data
public class GrandPa {

    private String name;

    public GrandPa(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("grand:"+name);
    }

    public String echo(){
        return "grandpa";
    }
}
