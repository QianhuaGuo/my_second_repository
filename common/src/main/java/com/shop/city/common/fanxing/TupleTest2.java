package com.shop.city.common.fanxing;

import static com.shop.city.common.fanxing.Tuple.tuple;

public class TupleTest2 {
    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }
    static TwoTuple ff(){
        return tuple("hh",56);
    }
    static ThreeTuple<Amphibian,String,Integer> f2(){
        return tuple(new Amphibian(),"hj",45);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> f3(){
        return tuple(new Vehicle(),new Amphibian(),"hhh",23);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> f4(){
        return tuple(new Vehicle(),new Amphibian(),"jkl",55,55.5D);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(ff());
        System.out.println(f2());
        System.out.println(f3());
        System.out.println(f4());
    }
}
