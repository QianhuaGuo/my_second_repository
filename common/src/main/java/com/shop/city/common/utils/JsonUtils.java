package com.shop.city.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtils {

    // JSON输出工具
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    public enum LOG_TYPE {
        PARAM, DEFAULT
    }

    public static <T> T toBean(String json, Class<? extends T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            LOGGER.error("Json to Bean Error：", e);
        }
        return null;
    }

    /**
     * json工具
     *
     * @param obj
     * @author Moon Yang
     * @since 2018-03-23
     */
    public static String toJson(Object obj) {
        String log = "";
        if (obj == null)
            return log;

        try {
            log = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            LOGGER.error("toLogJson Error：", e);
        }
        return log;
    }

    /**
     * json工具
     *
     * @param obj
     * @author Moon Yang
     * @since 2018-03-23
     */
    public static void printLog(LOG_TYPE type, Object obj) {
        if (obj == null)
            return;

        try {
            String log = objectMapper.writeValueAsString(obj);
            switch (type) {
                case PARAM:
                    LOGGER.info("【方法参数】：{}", log);
                    break;
                default:
                    LOGGER.info(log);
                    break;
            }
        } catch (Exception e) {
            LOGGER.error("日志输出异常：", e);
        }
    }

}
