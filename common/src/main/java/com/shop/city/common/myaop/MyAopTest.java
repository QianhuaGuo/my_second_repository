package com.shop.city.common.myaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Watermelon
 * @Date: 2021/3/15 13:40
 */
@Component
@Aspect
public class MyAopTest {

    @Pointcut("@annotation(com.shop.city.common.annotation.AroundTest)")
    public void pointcut(){}

    @Around("pointcut()")
    public String around(final ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        if (args != null){
            try {
                proceedingJoinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return "参数不为空！";
        }
        return "环绕通知来了";
    }
}
