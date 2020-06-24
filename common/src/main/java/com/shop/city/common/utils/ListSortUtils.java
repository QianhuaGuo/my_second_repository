package com.shop.city.common.utils;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.comparators.ComparableComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 集合排序工具类
 */
public class ListSortUtils {

    /**
     * @describe 依据某个字段对集合进行排序
     * @author biaoge
     * @param list
     *            待排序的集合
     * @param fieldName
     *            依据这个字段进行排序
     * @param asc
     *            如果为true，是正序；为false，为倒序
     */
    @SuppressWarnings("unchecked")
    public static <T> void sort(List<T> list, String fieldName, boolean asc) {
        Comparator<?> mycmp = ComparableComparator.getInstance();
        mycmp = ComparatorUtils.nullLowComparator(mycmp); // 允许null
        if (!asc) {
            mycmp = ComparatorUtils.reversedComparator(mycmp); // 逆序
        }
        Collections.sort(list, new BeanComparator(fieldName, mycmp));
    }

}
