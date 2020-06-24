package com.shop.city.common.utils;

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

}
