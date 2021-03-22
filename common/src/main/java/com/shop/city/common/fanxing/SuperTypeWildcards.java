package com.shop.city.common.fanxing;

import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());//Error
    }

    static void writeTo2(List<? extends Apple> apples){
//        apples.add(new Apple());//Error
//        apples.add(new Fruit());//Error
    }
}
