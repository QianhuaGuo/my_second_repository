package com.shop.city.common.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * author  zhongjie
 * date 创建时间：2017年9月19日 下午5:41:38
 * version 1.0
 * parameter
 * since
 * return
 */
public class BeanCopyUtil {
    public static void copyProperties(Object source, Object target, String... innerFields) {
        BeanUtils.copyProperties(source, target);
        if (innerFields != null && innerFields.length > 0) {
            for (String field : innerFields) {
                Object innerValue = BeanConvertUtil.getField(source, field);
                if (null != innerValue) {
                    String clzName = BeanConvertUtil.getFieldType(target, field);
                    if (null != clzName) {
                        try {
                            Class clz = Class.forName(clzName);
                            Object innerObj = clz.newInstance();
                            BeanUtils.copyProperties(innerValue, innerObj);
                            BeanConvertUtil.setField(target, field, innerObj);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /**
     * 从List<A> copy到List<B>
     *
     * @param list  List<B>
     * @param clazz B
     * @return List<B>
     */
    public static <T> List<T> copy(List<?> list, Class<T> clazz) {
        String oldOb = JSON.toJSONString(list);
        return JSON.parseArray(oldOb, clazz);
    }
}
