package com.shop.city.common.annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: Watermelon
 * @Date: 2021/3/15 13:52
 */
@Configuration
@Component
public class AppConfig implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (AppConfig.applicationContext == null){
            AppConfig.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static <T> T getBean(Class<T> clazz){
        int i = 0;
        ApplicationContext applicationContext = getApplicationContext();
        return applicationContext.getBean(clazz);
    }

}
