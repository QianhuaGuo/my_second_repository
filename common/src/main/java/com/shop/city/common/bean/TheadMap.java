package com.shop.city.common.bean;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class TheadMap{

    private static Map<Object,Object> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("jjjjj");
        Thread[] threads = new Thread[2];

        for (int i = 0;i<2;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put("",Thread.currentThread().getName());
                }
            });
            threads[i].start();
            i++;
        }

       for (Map.Entry<Object,Object> entry : map.entrySet()){
           System.out.println(entry.getKey()+":"+entry.getValue());
       }

    }
}
