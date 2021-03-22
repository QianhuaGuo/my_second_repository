package com.shop.city.common.bean;

import io.swagger.models.auth.In;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @Author: Watermelon
 * @Date: 2021/3/16 9:54
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
//        map.put("1","1");
        System.out.println(map.size());

        Hashtable<String,String> tb = new Hashtable<>();
        HashSet<String> set = new HashSet<>();
        String put = map.put("1", "1");
        String put2 = map.put("1", "1");
        System.out.println(put);
        System.out.println(put2);
        boolean aa = set.add("aa");
        boolean aa2 = set.add("aa");
        System.out.println(aa2);

        String ss[] = new String[5];
        ss[0] = "ss";
        ss[2] = "sss";
        ss[3] = "ssss";
        ss[4] = "ssss";
        String s = ss[3];

        String aaa = "aaaaa";
        String mm = new String("aaaaa");
        System.out.println("333333333333"+aaa.equals(mm));
        System.out.println("333333333333"+aaa==mm);



        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<String> ls = new LinkedList<>();
        ls.add("ss");
        ls.add("sss");
        ls.add("ssss");
        ls.add("sssss");
        ls.get(1);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
