package com.shop.city.common.jvmtest;

import com.shop.city.common.bean.Singleton;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Watermelon
 * @Date: 2021/3/23 11:42
 */
public class SingletonThreadTest {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
//        l.add("ddd");
        Map<String,String> m1 = new HashMap<>();
        m1.put("a","a");
        Map<String,String> m2 = new Hashtable<>();
        Map<String,String> m3 = new ConcurrentHashMap<>();

        Object o = new Object();



//        Thread[] threads = new Thread[20000];
//        for (int i = 0;i<threads.length;i++){
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Singleton.getInstance());
//                }
//            });
//            threads[i].start();
//        }
    }
}
