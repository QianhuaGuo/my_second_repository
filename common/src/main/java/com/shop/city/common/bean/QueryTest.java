package com.shop.city.common.bean;

import com.shop.city.common.utils.Query;

public class QueryTest {

    public static void main(String[] args) {
        Query query = new Query();
        query.setLimit(10);
        query.setPage(1);
        System.out.println(query.getOffset());
    }
}
