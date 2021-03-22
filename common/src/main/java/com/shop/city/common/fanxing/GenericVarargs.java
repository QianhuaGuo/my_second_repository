package com.shop.city.common.fanxing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        List<T> result = new ArrayList<>();
        for (T item : args){
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("a","b","c");
        System.out.println(ls);
        ls = makeList("abcdefghijklmnopqrstuvwxyz".split(""));
        System.out.println(ls);
    }
}
