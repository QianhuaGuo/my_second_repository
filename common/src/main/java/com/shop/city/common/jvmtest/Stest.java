package com.shop.city.common.jvmtest;

/**
 * @Author: Watermelon
 * @Date: 2021/3/19 13:49
 */
public class Stest {

    static int n = 3;
    static {
        int i = 0;
        System.out.println("i:"+i);
        int n = 5;
        System.out.println("n:"+n);
    }

    static int i = 1;

    public static void main(String[] args) {
        System.out.println(Stest.i);
        System.out.println(Stest.n);
    }
}
