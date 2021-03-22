package com.shop.city.common.jvmtest;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class GrandTest {
    class GrandFather{
        void thinking(){
            System.out.println("i am grandfather");
        }
    }
    class Father extends GrandFather{
        void thinking(){
            System.out.println("i am father");
        }
    }
    class Son extends Father{
        void thinking(){
            //此处实现调用GrandFather的thinking()
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = MethodHandles.lookup().findSpecial(GrandFather.class,"thinking",mt,getClass());
                mh.invoke(this);
            }catch (Throwable e){

            }
//            super.thinking();
        }
    }

    public static void main(String[] args) {
        (new GrandTest().new Son()).thinking();
    }
}
