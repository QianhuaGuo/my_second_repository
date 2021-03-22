package com.shop.city.common.jvmtest;

/**
 * 非法向前引用变量
 * 类构造器<clinit>()方法是由编译器自动收集类中所有类变量的赋值动作和静态代码块（static{}块）
 * 中的语句合并产生的，编译器收集的顺序是由语句在源文件中出现的顺序决定的，静态语句块中只能
 * 访问到静态语句块之前的变量，定义在它之后的变量，在静态语句块可以赋值，但是不能访问。
 */
public class Test {
    static{
        i = 0;//给变量赋值可以正常通过
//        System.out.println(i);//这句编译会提示“非法向前引用”
    }
    static int i;
}
