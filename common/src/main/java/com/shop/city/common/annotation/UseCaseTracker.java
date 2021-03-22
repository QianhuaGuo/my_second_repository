package com.shop.city.common.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Watermelon
 * @Date: 2021/1/20 15:05
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){
        for (Method m :cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
//            int modifiers = m.getModifiers();
            if (uc != null){
                System.out.println("Found Use Case:"+uc.id() + " "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i :useCases){
            System.out.println("warning: missing use case-"+i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases,PasswordUtil.class);
    }
}
