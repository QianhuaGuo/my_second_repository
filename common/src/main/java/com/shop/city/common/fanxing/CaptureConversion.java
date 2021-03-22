package com.shop.city.common.fanxing;

@SuppressWarnings("unchecked")
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder){
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);//Produces warnings
        f2(raw);//no warnings

        Holder rawBasic = new Holder();
        rawBasic.set(new Object());//warnings
        f2(rawBasic);//no warnings
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}
