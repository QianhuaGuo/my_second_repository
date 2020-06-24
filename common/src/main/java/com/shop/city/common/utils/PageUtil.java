package com.shop.city.common.utils;

import java.util.Collections;
import java.util.List;

/**
 * @author: xiayuejie
 * @date: 2019/7/26 14:15
 * @description:
 */
public class PageUtil {
    public static <T> List<T> getPage(Query query, List<T> list) {
        int limit = query.getLimit();
        int page = query.getPage();
        int total = list.size();
        if (limit * (page - 1) < total) {
            return list.subList(limit * (page - 1), (limit * page > total ? total : (limit * page)));
        }
        return Collections.emptyList();
    }

    public static <T> List<T> getPage(Integer limit, Integer page, List<T> list) {

        int total = list.size();
        if (limit * (page - 1) < total) {
            return list.subList(limit * (page - 1), (limit * page > total ? total : (limit * page)));
        }
        return Collections.emptyList();
    }
}