package com.shop.city.common.enumtest;

public enum SpaceShip {
    AAA,BBB,CCC,DDD;

    public String toString(){
        String id = name();
        String low = id.substring(1).toLowerCase();
        return id.charAt(0) +low;
    }

    public static void main(String[] args) {
        for (SpaceShip s : values()){
            System.out.println(s);
        }
    }
}
