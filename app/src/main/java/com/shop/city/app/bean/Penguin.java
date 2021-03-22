package com.shop.city.app.bean;

import com.shop.city.app.service.Brid;

public class Penguin implements Brid {
    @Override
    public void move() {
        System.out.println("我是Penguin");
    }
}
