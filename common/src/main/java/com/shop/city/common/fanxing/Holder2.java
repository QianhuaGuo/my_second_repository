package com.shop.city.common.fanxing;

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }
    public void set(Object a){
        this.a = a;
    }
    public Object get(){
        return a;
    }

    /**
     * h2可以存储不同类型的对象
     * @param args
     */
    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) h2.get();
        h2.set("not a automobile");
        String s = (String) h2.get();
        h2.set(1);
        Integer x = (Integer) h2.get();
    }
}
