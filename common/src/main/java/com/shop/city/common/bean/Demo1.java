package com.shop.city.common.bean;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        String ss = "1,2,3,4,5";

        List<Long> list1= Arrays.asList(ss.split(",")).stream().map(s -> Long.parseLong(s.trim())).collect(Collectors.toList());
        for (int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("^^^^^^^^^^"+list1.toString());
        //List转String
        String s = StringUtils.join(list1,",");
        System.out.println("~~~~~~~~"+s);
        String sss = StringUtils.strip(list1.toString(),"[]");
        System.out.println("-------------"+sss);
        ChooseType em = ChooseType.DB_NO001;
        System.out.println(em);
    }

    public enum ChooseType{
        DB_NO001,
        DB_NO002
    }
}
