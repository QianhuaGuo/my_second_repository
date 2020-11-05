package com.shop.city.common.utils;

import java.time.Instant;

public class DateTime8Util {


    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("current:"+instant);

        System.out.println(System.currentTimeMillis());

        String str1 = "abc";

        byte[] bytes = str1.getBytes();
        for (Byte b : bytes){
//            System.out.println(b);
            System.out.println(Byte.toString(b));
        }
    }


}
