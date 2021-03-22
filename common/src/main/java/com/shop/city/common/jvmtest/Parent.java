package com.shop.city.common.jvmtest;

public class Parent implements Interface1 {
    public static int A = 3;

    public static void main(String[] args) {
        Parent parent = new Parent();
        String s = new String("jjj");
//        System.out.println(parent.getClass().getClassLoader().getParent());
        System.out.println(s.getClass().getClassLoader());
    }
}
