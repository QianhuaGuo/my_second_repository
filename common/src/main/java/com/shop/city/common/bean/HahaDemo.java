package com.shop.city.common.bean;

public class HahaDemo {

    public void foo(final int a){
        final int b = 9;
//        b = a+b;
    }
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 128;
        Integer f = 128;
        Long g = 3L;

        System.out.println(c==d);//true
        System.out.println(e == f);//false -128~127(为减少资源占用，java规定在-128~127之间的Integer类型的变量，直接指向常量池中的缓冲地址，不会new开辟新的空间)
        System.out.println(c == (a+b));//true
        System.out.println(c.equals(a+b));//true
        System.out.println(g == (a+b));//true
        System.out.println(g.equals(a+b));//false 类型不同
        System.out.println(Integer.MAX_VALUE);


        System.out.println(1<<3);
        System.out.println(2<<2);
        System.out.println(3<<2);
    }
}
