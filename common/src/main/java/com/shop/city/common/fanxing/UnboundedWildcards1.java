package com.shop.city.common.fanxing;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list){
        list1 = list;
        list2 = list;
        //todo:这里会出现Warning:unchecked conversion Found :List ,required
        //todo:List<? extends Object>
        list3 = list;
    }

    static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList<>());
        assign3(new ArrayList<>());


        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());

        List<?> wildlist = new ArrayList<>();
        assign1(wildlist);
        assign2(wildlist);
        assign3(wildlist);
    }
}
