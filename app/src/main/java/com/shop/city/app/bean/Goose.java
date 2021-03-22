package com.shop.city.app.bean;

import com.shop.city.app.service.Brid;

public class Goose implements Brid {

    public static int i = 47;

    public Goose() {
    }

    static void increment(){
        Goose.i++;
    }

    @Override
    public void move() {
        int i;
        System.out.println("我是Goose");
    }

    public void eat(){
        System.out.println("我能吃Goose");
    }

    void hah()
    {
        System.out.println("void");
    }
}
