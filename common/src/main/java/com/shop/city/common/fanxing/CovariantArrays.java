package com.shop.city.common.fanxing;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        //运行类型是Apple[] ,不是Fruit[]或Orange[]
        try {
            //编译器允许你添加Fruit
            fruits[0] = new Fruit();//ArrayStoreException
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            //编译器允许你添加Orange
            fruits[0] = new Orange();//ArrayStoreException
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
