package com.shop.city.common.fanxing;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s:("q w e r t y u i").split(" ")){
            rs.add(s);
        }
        for (int i = 0;i<11;i++){
            System.out.println(rs.select());
        }
    }
}