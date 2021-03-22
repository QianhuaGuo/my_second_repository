package com.shop.city.common.bean;

/**
 * @Author: Watermelon
 * @Date: 2021/1/29 11:42
 */
public class Sub extends Super {
    public int field = 1;
    public int a = 3;

    @Override
    public int getField(){
        return field;
    }

    public String getstring(){
        return "sub;";
    }
}
