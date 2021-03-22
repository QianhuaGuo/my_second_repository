package com.shop.city.common.bean;

/**
 * @Author: Watermelon
 * @Date: 2021/1/27 10:44
 */
public class Father extends GrandPa{
    public Father(){
        super("father");
    }

    public String ee(){
        return "father";
    }
    public static void main(String[] args) {
        Father father = new Father();
        father.print();
    }
}
