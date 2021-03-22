package com.shop.city.common.jvmtest;


public class Sub extends Parent implements Interface2 {
    public static int A = 4;

    public static void main(String[] args) {
        System.out.println(Sub.A);
    }
}
