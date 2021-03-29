package com.shop.city.common.bean;

/**
 * @Author: Watermelon
 * @Date: 2021/3/23 11:37
 * 静态内部类实现线程安全的单利模式
 */
public class Singleton {

    public Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.s;
    }

    private static class SingletonHolder{
        private static final Singleton s = new Singleton();
    }
}
