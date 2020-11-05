package com.shop.city.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 唯一ID生成器
 */
public final class IdUtils {

    /**
     * 10位的随机数
     *
     * @return
     */
    private static String createShortRandomId() {
        String id = createID();
        id = id.substring(0, 10);
        return id.toUpperCase();
    }

    /**
     * 20位的随机数
     *
     * @return
     */
    private static String createRandomId() {
        String id = createID();
        id = id.substring(0, 20);
        return id.toUpperCase();
    }

    /**
     * 根据类型生成id
     *
     * @param type
     * @return
     */
    public static String createID(final String type) {
        return type + createID();
    }

    /**
     * 生成ID
     *
     * @return
     */
    public static String createID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    //length用户要求产生字符串的长度
    public static String getRandomString(int length){
        String str="0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(10);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 生成时间id
     *
     * @return
     */
    public static String getId() {
        StringBuffer sb=new StringBuffer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        sb.append(sdf.format(new Date()));
        sb.append(getRandomString(10));
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = getId();
        System.out.println(s);
    }

}
