package com.shop.city.common.jvmtest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Watermelon
 * @Date: 2021/3/15 10:59
 */
public class LamdbaTest {

    static String salutation = "Hello! ";

    public static void main(String[] args) {
        Map<String,String> mm = new HashMap<>();
        System.out.println(mm.size());
        mm.put("1","1");
        LamdbaTest test = new LamdbaTest();
        MathOperation add = (int a,int b)->a+b;
        System.out.println("10 + 5 = " + test.opreate(10,5,add));

        GreetService greetService = message -> System.out.println(salutation + message);
        greetService.sayHello("jjj");

        int num = 1;
        Converter<Integer,String> s = (param)-> System.out.println(String.valueOf(param + num));
        s.conver(3);

    }

    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetService{
        void sayHello(String message);
    }

    interface Converter<T1,T2>{
        void conver(int i);
    }

    private int opreate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
