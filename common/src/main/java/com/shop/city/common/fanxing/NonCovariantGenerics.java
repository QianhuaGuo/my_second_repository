package com.shop.city.common.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonCovariantGenerics {
    //编译错误，不能将一个Apple容器赋值给一个Fruit容器
//    List<Fruit> fruits = new ArrayList<Apple>();



    public static void main(String[] args) {
        //通配符允许协变性
        List<? extends Fruit> fruits = new ArrayList<Apple>();
        //编译错误，不能添加任何类型的对象
//        fruits.add(new Apple());
//        fruits.add(new Fruit());
//        fruits.add(new Object());
        fruits.add(null);//合法但没意义
        Fruit f = fruits.get(0);






        List<? extends Fruit> ff = Arrays.asList(new Apple());
        Apple a = (Apple) ff.get(0);
        ff.contains(new Apple());
        ff.indexOf(new Apple());
//        ff.add(new Fruit());//编译错误
    }
}
