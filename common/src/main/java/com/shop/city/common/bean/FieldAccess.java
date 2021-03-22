package com.shop.city.common.bean;

import io.swagger.models.auth.In;

import java.util.HashSet;

/**
 * @Author: Watermelon
 * @Date: 2021/1/29 11:43
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        int b = ((Sub) sup).a;
        Integer i = new Integer(3);
        Integer in = Integer.valueOf(5);
        String s = "s";
        String s1 = s.intern();
        String ss = new String("s");
        if (s == ss){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (s.equals(ss)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        HashSet<String> set = new HashSet<>();
        set.add(new String("a"));
        set.add(new String("b"));
        set.add(new String("c"));
        for (String a : set){

            a = "a";

        }
        for (String sss : set){
            System.out.println(sss);
        }
//        System.out.println("sup.field = "+((Sub) sup).field +",sup.getField() = "+sup.getField());
    }
}
