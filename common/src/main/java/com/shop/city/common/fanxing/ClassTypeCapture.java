package com.shop.city.common.fanxing;

import springfox.documentation.builders.BuilderDefaults;

public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object obj){
        return kind.isInstance(obj);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctc1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctc1.f(new Building()));
        System.out.println(ctc1.f(new House()));

        ClassTypeCapture<House> ctc2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctc2.f(new House()));
        System.out.println(ctc2.f(new Building()));
    }
}
