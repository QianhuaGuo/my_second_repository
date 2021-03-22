package com.shop.city.common.fanxing;

public class GenericMethods {
//    public <T,U,E> void f(T t,U u,E e){
//        System.out.println(t.getClass().getName()+"|"+u.getClass().getName()+"|"+e.getClass().getName());
//    }
    public <T,U> void f(T t,U u,String e){
        System.out.println(t.getClass().getName()+"|"+u.getClass().getName()+"|"+e.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
//        gm.f("",1,1.0F);

//        gm.f(1);
//        gm.f(1.0);
//        gm.f(1.0F);
//        gm.f('c');
//        gm.f(gm,'c',1.0);
        gm.f(gm,1.0F,"jjj");
    }
}
