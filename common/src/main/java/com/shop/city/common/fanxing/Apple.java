package com.shop.city.common.fanxing;

import com.shop.city.common.utils.Query;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Apple extends Fruit {
    public static void main(String[] args) {
        String date = LocalDateTime.now().toLocalDate().toString();
        String d = date.replaceAll("-","");
        System.out.println(d);

        Map<String,Object> map = new ConcurrentHashMap<>();



        Query query = new Query();
        query.setPage(2);
        int start = query.getOffset();
        System.out.println(start);

    }
}
