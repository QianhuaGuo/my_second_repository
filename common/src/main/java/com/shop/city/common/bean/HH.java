package com.shop.city.common.bean;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Watermelon
 * @Date: 2021/1/14 15:42
 */
public class HH {

    public static void main(String[] args) {


//        HH.getss();

        int i = 1;

        double d = 1.1;

        double b = 0.1;

        double c= d-b;

        System.out.println(i == c);

    }

    public static void getss(){

        Integer i = 9;
        Number number = 5;

        List<String> ids = new ArrayList<>();
        ids.add("001");
        if (CollectionUtils.isEmpty(ids)){
            return;
        }
        System.out.println("hhh");
    }
}
