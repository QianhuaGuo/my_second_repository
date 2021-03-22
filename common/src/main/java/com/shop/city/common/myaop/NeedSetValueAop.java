package com.shop.city.common.myaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author: Watermelon
 * @Date: 2021/2/23 16:17
 */
@Component
@Aspect
public class NeedSetValueAop {

    @AfterReturning(value = "@annotation(com.shop.city.common.annotation.UseCase)",returning = "ret")
    public void SetValue(Object ret){

    }
}
