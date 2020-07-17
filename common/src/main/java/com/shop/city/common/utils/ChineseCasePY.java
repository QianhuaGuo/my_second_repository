package com.shop.city.common.utils;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.List;

public class ChineseCasePY {

    /**
     * 获取汉字拼音方法（不提供大小写转换）
     * */
    public static String getHanziPinYin(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                // 逐个汉字进行转换， 每个汉字返回值为一个String数组（因为有多音字）
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if(null != stringArray) {
                    // 把第几声这个数字给去掉
                    sb.append(stringArray[0].replaceAll("\\d", ""));
                }
                if (null == stringArray){
                    sb.append(ch);
                }
            }
            if(sb.length() > 0) {
                result = sb.toString();
            }
        }
        return result;
    }

    /**
     * 获取汉字拼音方法（不提供大小写转换）
     * */
    public static String getHanZiSpell(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                // 逐个汉字进行转换， 每个汉字返回值为一个String数组（因为有多音字）
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if(null != stringArray) {
                    // 把第几声这个数字给去掉
                    sb.append(stringArray[0].replaceAll("\\d", "").trim().substring(0,1));
                }
                if (null == stringArray){
                    sb.append(ch);
                }
            }
            if(sb.length() > 0) {
                result = sb.toString();
            }
        }
        result = result.toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        String p = getHanZiSpell("郭千华");
        System.out.println(p);
    }
}
