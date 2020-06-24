package com.shop.city.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.concurrent.ThreadLocalRandom;

public class CodeUtils {

    /**
     * 以当前用户为种子，生成订单号
     * @return
     */
    public static String genOrderCode(){
        return FastDateFormat.getInstance("yyMMddHHmmssSSS").format(System.currentTimeMillis()).concat(String.format("%03d",System.nanoTime()%1000)).concat(StringUtils.leftPad(String.valueOf(ThreadLocalRandom.current().nextInt(0, 999999)), 6, "0"));
    }

    /**
     * 以当前用户为种子，生成退单号
     * @return
     */
    public static String genBackOrderCode(){
        return "R" + FastDateFormat.getInstance("yyMMddHHmmssSSS").format(System.currentTimeMillis()).concat(String.format("%03d",System.nanoTime()%1000)).concat(StringUtils.leftPad(String.valueOf(ThreadLocalRandom.current().nextInt(0, 999999)), 6, "0"));
    }
}
