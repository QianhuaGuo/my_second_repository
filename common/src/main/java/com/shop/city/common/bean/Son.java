package com.shop.city.common.bean;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Watermelon
 * @Date: 2021/1/27 10:43
 */
@Data
public class Son extends Father implements Cloneable{
    private String name;

//    public Son(String name){
//        super();
//    }

    @Override
    public Son clone() throws CloneNotSupportedException{
        return (Son) super.clone();
    }

    public static void main(String[] args){

        HashMap<String,String> map = new HashMap<>();

        map.put("1", "a");
        map.put("1", "a");
        System.out.println(map.size());

        Map<String,String> currentMap = new ConcurrentHashMap<>();
        Map<String,String> linkMap = new LinkedHashMap<>();
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        map.put("1", "a");
//        Son s = new Son();
//        Son ss = new Son();
//        try {
//            Son clone = s.clone();
//            System.out.println(s.equals(clone));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        List<String> l = new ArrayList<>();
////        l.add("aa");
//        List<Son> sss = new ArrayList();
//        sss.add(s);
//        sss.add(ss);
//        List<Son> l1 = new ArrayList<>(sss);
//
//        List<String> ll = Collections.synchronizedList(new ArrayList<>());
//
//        List<String> linkedList = new LinkedList<>();
//
//
////        String s1 = map.put("1","b");
//
////        System.out.println("f:"+f+"      "+"s1:"+s1);
//
//        l.add("0");
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        l.add("4");
//        System.out.println(l);
//        String remove = l.remove(1);
//
//        System.out.println(l.getClass());

//        s.print();
//
//        GrandPa g = new Father();
//        Father f = (Father) new GrandPa();

    }
}
