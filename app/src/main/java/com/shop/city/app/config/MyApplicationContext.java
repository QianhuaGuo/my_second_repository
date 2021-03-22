package com.shop.city.app.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: Watermelon
 * @Date: 2021/2/24 15:04
 */
@Component
public class MyApplicationContext implements ApplicationContextAware {

    private static ApplicationContext MyapplicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.MyapplicationContext = applicationContext;
    }


}
