package com.shop.city.common.fanxing;

/**
 * Holder有一个接收T类对象的set()方法，一个get()方法，以及一个接收Object对象
 * 的equals()方法。正如你已经看到的，如果创建一个Holder<Apple>,不能将其向上转型为
 * Holder<Fruit>,但是可以将其向上转型为Holder<? extends Fruit>.如果调用get(),
 * 它只会返回一个Fruit----这就是在给定“任何扩展自Fruit的对象”这一边界之后，它
 * 所能知道的一切了。如果能够了解更多的信息，那么你可以转型到某种具体的Fruit类型，
 * 而不会导致任何警告，但是你存在着得到ClassCastException的风险。
 * set()方法不能工作于Apple或Fruit，因为set()的参数也是“？ extends Fruit”，这
 * 意味着它可以是任何事物，而编译器无法验证“任何事物”的类安全性。
 * 但是，equals()方法工作良好，因为它将接受Object类型而非T类型的参数。因此
 * 编译器只关注传递进来和要返回的对象类型，它并不会分析代码，已查看是否执行了任何实际的
 * 写入和读取操作
 * @param <T>
 */
public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){value = val;}
    public void set(T val){value = val;}
    public T get(){return value;}
    public boolean equals(Object obj){
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);

//        Holder<Fruit> Fruit = Apple;//不能向上转型
        Holder<? extends Fruit> fruit = Apple;//ok
        Fruit p = fruit.get();
        d = (Apple) fruit.get();//returns Object

        try {
            Orange c = (Orange) fruit.get();//no warning
        }catch (Exception e){
            System.out.println(e);
        }
//        fruit.set(new Apple());//cannot call set()
//        fruit.set(new Fruit());//cannot call set()
        System.out.println(fruit.equals(d));
    }
}
