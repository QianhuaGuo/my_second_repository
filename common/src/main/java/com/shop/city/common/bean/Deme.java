package com.shop.city.common.bean;

import com.shop.city.common.enumtest.TestEnum2;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Data
public class Deme {

    private String ss;

    public Deme(String ss){
        ss = this.ss;
    }




    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
//        list.add("aa");
//        list.add("aaa");
//        list.add("aaaa");
//        list.add("aaaaa");
//        list.add("aaaaaa");
        list.add("bb");
        list.add("aaaaaaaa");
        list.add("aaaaaaaaa");
        list.add("bb");
        list.add("aaaaaaaaa");
        list.add("aaaaaaaaa");
//        list.removeAll(list);


//        list.add(1,"cc");
//        list.clear();
//        List<String> clon = (List<String>) ((ArrayList<String>) list).clone();
//        for (String s :clon){
//            System.out.println(s);
//        }
//        if (list.equals(clon)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        Object[] ss = list.toArray();
//        System.out.println(ss.getClass());
//        System.out.println(list.getClass());
//        if (list.equals(ss)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        int i = list.lastIndexOf("bb");
//        System.out.println(i);
//        List<String> a = list.subList(0,5);
//
//        System.out.println(list.indexOf("a"));
//        System.out.println(list.size());

//        System.out.println(a.toString());
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        Set<String> ss = new LinkedHashSet<>();
//        ss.add("aa");
//        ss.add("bb");
//        ss.add("cc");
//        Object[] objects = ss.toArray(new Object[0]);
//        System.out.println(objects.toString());
//        for (Object s : objects){
//            System.out.println("s:"+s);
//        }
//        System.out.println(StringUtils.arrayToCommaDelimitedString(objects));

//        int l = load(ss);

//        Integer nn = 88888;
//        Integer mm = 0;
//        for(int i = 0;i<6;i++){
//            mm+=nn;
//        }
//        System.out.println(new BigDecimal(mm).divide(new BigDecimal(10000),2, RoundingMode.HALF_UP).doubleValue());
//        System.out.println(new BigDecimal(nn).setScale(2,RoundingMode.HALF_UP));

        Map<String,Object> map = new HashMap<>();
        map.put("no1",1);
        map.put("no2",2);
        map.get("no1");
    }

    public static int load(Set<String> ss){
        int count = 0;
        Object[] n1 = ss.toArray(new Object[0]);
        int n2 = n1.length;

        for (int n3=0;n3<n2;++n3){
            System.out.println("n3:"+n3);
            Object source = n1[n3];
            System.out.println("hhhhh"+source);
            count++;
        }
       return count;
    }
}
