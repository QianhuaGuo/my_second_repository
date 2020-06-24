package com.shop.city.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * MD5加密工具
 *
 */
public class MD5Tools {

    private static final Logger logger = LoggerFactory.getLogger(MD5Tools.class);

    public static String getMD5Str(String str) {
        if (str == null || "".equals(str.trim())) {
            return null;
        }

        // 加密之后所得字节数组
        byte[] bytes = null;
        try {
            // 获取MD5算法实例 得到一个md5的消息摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 添加要进行计算摘要的信息
            md.update(str.getBytes());
            // 得到该摘要
            bytes = md.digest();
        } catch (Exception e) {
            // System.out.println("加密算法异常...");
            logger.debug("MD5加密异常");
        }

        if (bytes != null) {
            return BytesConvertToHexString(bytes);
        }
        return null;
    }

    /**
     * 把字节数组转化成字符串返回
     *
     * @param bytes
     * @return
     */
    public static String BytesConvertToHexString(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (byte aByte : bytes) {
            String s = Integer.toHexString(0xff & aByte);
            if (s.length() == 1) {
                sb.append("0" + s);
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        // String md5Str = MD5Tools.getMD5Str("000000");
        // System.out.println(md5Str);

        // 创建默认管理员账户 test_admin/000000
        String salt = UUID.randomUUID().toString().replace("-", "");
        System.out.println(salt);
        String password = MD5Tools.getMD5Str("10000" + MD5Tools.getMD5Str("000000") + salt);
        System.out.println(password);
    }

}
