package com.shop.city.common.fanxing;

public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile automobile = h3.get();//no cast needed
        //h3.set("not a automobile");//Error
        //h3.set(1);//Error
    }
}
