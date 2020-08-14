package com.shop.city.common.bean;

import com.shop.city.common.enumtest.TestEnum2;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Deme {

    private String ss;

    public Deme(String ss){
        ss = this.ss;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
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
        List<String> a = list.subList(0,5);

        System.out.println(a.toString());
    }
}
