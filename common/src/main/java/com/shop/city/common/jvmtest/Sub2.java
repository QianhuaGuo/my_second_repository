package com.shop.city.common.jvmtest;

/**
 * 类构造器<clinit>()方法与类的构造器函数（或者说实例构造器<init>()方法）
 * 不同，它不需要显示的调用父类构造器，虚拟机会保证在子类<clinit>()方法
 * 执行之前，父类的<clinit>()方法已经执行完毕。因此，在虚拟机中第一个被执行的
 * <clinit>()方法肯定是java.lang.Object.
 *
 * 由于父类的<clinit>()方法先执行，也就意味着父类中定义的静态语句块要优于子类的变量赋值操作
 * ，所以字段B的值将会是2而不是1
 */
public class Sub2 extends Parent2 {
    public static int B = A;

    public static void main(String[] args) {
        System.out.println(Sub2.B);
    }
}
