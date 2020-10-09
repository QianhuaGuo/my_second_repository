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
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        list.add("aaaaa");
        list.add("aaaaaa");
        list.add("aaaaaaa");
        list.add("aaaaaaaa");
        list.add("aaaaaaaaa");
        list.add("aaaaaaaaaa");
//        List<String> a = list.subList(0,5);
//
//        System.out.println(list.indexOf("a"));
//        System.out.println(list.size());

//        System.out.println(a.toString());
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
        Set<String> ss = new LinkedHashSet<>();
        ss.add("aa");
        ss.add("bb");
        ss.add("cc");
//        Object[] objects = ss.toArray(new Object[0]);
//        System.out.println(objects.toString());
//        for (Object s : objects){
//            System.out.println("s:"+s);
//        }
//        System.out.println(StringUtils.arrayToCommaDelimitedString(objects));

//        int l = load(ss);

        Integer nn = 88888;
        Integer mm = 0;
        for(int i = 0;i<6;i++){
            mm+=nn;
        }
//        System.out.println(new BigDecimal(mm).divide(new BigDecimal(10000),2, RoundingMode.HALF_UP).doubleValue());
        System.out.println(new BigDecimal(nn).setScale(2,RoundingMode.HALF_UP));
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
