package com.shop.city.common.fanxing;

import java.util.HashMap;
import java.util.Map;

public class UnboundedWildcards2 {
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;

    static void assign1(Map map){
        map1 = map;
//        map2 = map;
//        map3 = map;
    }
    static void assign2(Map<?,?> map){
        map1 = map;
//        map2 = map;
//        map3 = map;//Error 必须是Map<String,?>
    }
    static void assign3(Map<String,?> map){
        map3 = map;
//        map2 = map;
//        map1 = map;
    }

    public static void main(String[] args) {
        assign1(new HashMap());
        assign2(new HashMap<>());
        assign3(new HashMap<>());//Warning Unchecked conversion Found:HashMap Required:Map<String,?>


        assign1(new HashMap<String,Integer>());
        assign2(new HashMap<String,Integer>());
        assign3(new HashMap<String,Integer>());
    }

}
