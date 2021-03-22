package com.shop.city.common.bean;

import lombok.Data;

@Data
public class Dog {
    String name;
    String color;
    String weight;
    String address;

    public Dog(String name, String color, String weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小花","pink","12kg");
        setAddress(dog);
    }

    public static <T> void setAddress(T t){
        System.out.println(t);
    }
}
