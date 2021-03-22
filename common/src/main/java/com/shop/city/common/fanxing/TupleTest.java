package com.shop.city.common.fanxing;

public class TupleTest {
    static TwoTuple<String,Integer> f1(){
        return new TwoTuple<>("hi f1",2);
    }

    static ThreeTuple<Amphibian,String,Integer> f2(){
        return new ThreeTuple<>(new Amphibian(),"hi f2",3);
    }

    static FourTuple<Vehicle,Amphibian,String, Integer> f3(){
        return new FourTuple<>(new Vehicle(),new Amphibian(),"hi f3",4);
    }

    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> f4(){
        return new FiveTuple<>(new Vehicle(),new Amphibian(),"hi f4",5,12.3D);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f1();
        System.out.println(ttsi);
        //ttsi.first = "three";//编译错误，final
        System.out.println(f2());
        System.out.println(f3());
        System.out.println(f4());
    }
}
